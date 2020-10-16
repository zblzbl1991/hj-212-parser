package com.xy.format.hbt212;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xy.format.hbt212.core.T212Mapper;
import com.xy.format.hbt212.core.T212Parser;
import com.xy.format.hbt212.core.feature.ParserFeature;
import com.xy.format.hbt212.exception.T212FormatException;
import com.xy.format.hbt212.model.CpData;
import com.xy.format.hbt212.model.Data;
import com.xy.format.hbt212.model.DataFlag;
import com.xy.format.segment.base.cfger.Feature;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * ClassName: MapperTest
 * Description: <br/>
 * date: 2020/10/15 15:37
 *
 * @author 赵宝龙
 * @since JDK 1.8
 */
public class MapperTest {
    @Test
    public void testMapper() throws IOException, T212FormatException {
        String h212 = "##0136ST=32;CN=2011;PW=123456;MN=LD130133000015;CP=&&DataTime=20160824003817;B01-Rtd=36.91;011-Rtd=231.0,011-Flag=N;060-Rtd=1.803,060-Flag=N&&4980\r\n";
        String t="##0635QN=20201015123632010;ST=80;CN=2011;PW=123456;MN=410183160889201000212505;Flag=5;CP=&&DataTime=20201015123000;100000-Ia=401.400,100000-Ib=394.000,100000-Ic=382.000,100000-Ua=231.0,100000-Ub=231.4,100000-Uc=232.3,100000-Pt=267.3919,100000-Pa=90.8620,100000-Pb=89.2773,100000-Pc=87.2527,100000-Pdem=1.1268,100000-Ept=162762.484,100000-Epa=58128.980,100000-Epb=55640.578,100000-Epc=48992.922,100000-Eg1=16698.939,100000-Eg2=1.260,100000-Eg3=37.600,100000-Eg4=2.960,100000-Pa_ave=0.3964,100000-Pb_ave=0.3860,100000-Pc_ave=0.3713,100000-Tpa=25.3,100000-Tpb=25.3,100000-Tpc=25.3,100000-Pga=11.5,100000-Pgb=11.7,100000-Pgc=10.5,100000-Flag=N&&8201\r\n";
        T212Mapper mapper = new T212Mapper()
                .enableDefaultVerifyFeatures()
                .enableDefaultParserFeatures();

        //从T212字符串中读取Data对象
        Data data = mapper.readData(t);
        ObjectMapper objectMapper = new ObjectMapper();
        //.... use data
        System.out.println(objectMapper.writeValueAsString(data));
        //create data and set it
//        data.setPw("000000");
        //将Data对象写入成T212字符串
        Data data1 = new Data();
        data1.setQn("20201015123632010");
        data1.setSt("91");
        data1.setCn("9014");
        data1.setPw("123456");
        data1.setMn("410183160889201000212505");
//        DataFlag.A
        List<DataFlag> dataFlags = new ArrayList<>();
//        dataFlags.add(DataFlag.A);
        dataFlags.add(DataFlag.V0);
        data1.setDataFlag(dataFlags);
        CpData cpData = new CpData();
        data1.setCp(cpData);
        String result = mapper.writeDataAsString(data1);
        String response="##0087QN=20201015123632010;ST=91;CN=9014;PW=123456;MN=410183160889201000212505;Flag=4;CP=&&&&f001";
        System.out.println(result);
    }
    @Test
    public void crc() {
        String response="##0087QN=20201015123632010;ST=80;CN=2011;PW=123456;MN=410183160889201000212505;Flag=4;CP=&&&&2080\r\n";
        StringReader reader = new StringReader(response);
        T212Parser parser = new T212Parser(reader);
        parser.setParserFeature(Feature.collectFeatureDefaults(ParserFeature.class));
        try {
            assertArrayEquals(parser.readHeader(),new char[]{'#','#'});
            assertArrayEquals(parser.readDataLen(),new char[]{'0','0','8','7'});
            assertEquals(parser.readDataAndCrc(87).length,87);
            assertArrayEquals(parser.readFooter(),new char[]{'\r','\n'});
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            parser.close();
        }
    }


}
