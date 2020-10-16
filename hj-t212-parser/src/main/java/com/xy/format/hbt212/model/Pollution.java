package com.xy.format.hbt212.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xy.format.hbt212.core.validator.field.C;
import com.xy.format.hbt212.core.validator.field.N;
import com.xy.format.hbt212.core.validator.field.ValidDate;
import com.xy.format.hbt212.model.verify.groups.VersionGroup;
import io.swagger.annotations.ApiModelProperty;

import javax.json.bind.annotation.JsonbProperty;
import javax.validation.constraints.*;
import java.math.BigDecimal;

/**
 * 污染因子
 * Created by xiaoyao9184 on 2017/12/15.
 */
public class Pollution {

    @ApiModelProperty(value = "污染物采样时间", name = "SampleTime")
    @ValidDate(format = "yyyyMMddHHmmssSSS", groups = VersionGroup.V2017.class)
    @JsonProperty("SampleTime")
    @JsonbProperty("SampleTime")
    private String sampleTime;

    @ApiModelProperty(value = "污染物实时采样数据", name = "Rtd")
    @JsonProperty("Rtd")
    @JsonbProperty("Rtd")
    private BigDecimal rtd;

    @ApiModelProperty(value = "污染物指定时间内最小值", name = "Min")
    @JsonProperty("Min")
    @JsonbProperty("Min")
    private BigDecimal min;

    @ApiModelProperty(value = "污染物指定时间内平均值", name = "Avg")
    @JsonProperty("Avg")
    @JsonbProperty("Avg")
    private BigDecimal avg;

    @ApiModelProperty(value = "污染物指定时间内最大值", name = "Max")
    @JsonProperty("Max")
    @JsonbProperty("Max")
    private BigDecimal max;

    @ApiModelProperty(value = "污染物实时采样折算数据", name = "ZsRtd")
    @JsonProperty("ZsRtd")
    @JsonbProperty("ZsRtd")
    private BigDecimal zsRtd;

    @ApiModelProperty(value = "污染物指定时间内最小折算值", name = "ZsMin")
    @JsonProperty("ZsMin")
    @JsonbProperty("ZsMin")
    private BigDecimal zsMin;

    @ApiModelProperty(value = "污染物指定时间内平均折算值", name = "ZsAvg")
    @JsonProperty("ZsAvg")
    @JsonbProperty("ZsAvg")
    private BigDecimal zsAvg;

    @ApiModelProperty(value = "污染物指定时间内最大折算值", name = "ZsMax")
    @JsonProperty("ZsMax")
    @JsonbProperty("ZsMax")
    private BigDecimal zsMax;

    @ApiModelProperty(value = "监测污染物实时数据标记", name = "Flag", allowableValues = "可扩充[P,F,C,M,T,D,S,N,0,1,2,3]")
    @C(len = 1, groups = VersionGroup.V2017.class)
    @JsonProperty("Flag")
    @JsonbProperty("Flag")
    private String flag;

    @ApiModelProperty(value = "监测仪器扩充数据标记", name = "EFlag")
    @C(len = 4, groups = VersionGroup.V2017.class)
    @JsonProperty("EFlag")
    @JsonbProperty("EFlag")
    private String eFlag;

    @ApiModelProperty(value = "污染物指定时间内累计值", name = "Cou")
    @JsonProperty("Cou")
    @JsonbProperty("Cou")
    private BigDecimal cou;


    @ApiModelProperty(value = "设备运行状态的实时采样值", name = "RS")
    @Max(value = 1, groups = VersionGroup.V2005.class)
//    @N(integer = 1, groups = VersionGroup.V2005.class)
    @JsonProperty("RS")
    @JsonbProperty("RS")
    private Integer rs;

    @ApiModelProperty(value = "设备指定时间内的运行时间", name = "RT")
    @DecimalMax(value = "24", groups = VersionGroup.V2005.class)
//    @N(integer = 14, fraction = 2, groups = VersionGroup.V2005.class)
    @JsonProperty("RT")
    @JsonbProperty("RT")
    private BigDecimal rt;

    @ApiModelProperty(value = "污染物报警期间内采样值", name = "Ala")
    @N(integer = 14, fraction = 2, groups = VersionGroup.V2005.class)
    @JsonProperty("Ala")
    @JsonbProperty("Ala")
    private BigDecimal ala;

    @ApiModelProperty(value = "污染物报警上限值", name = "UpValue")
    @N(integer = 14, fraction = 2, groups = VersionGroup.V2005.class)
    @JsonProperty("UpValue")
    @JsonbProperty("UpValue")
    private BigDecimal upValue;

    @ApiModelProperty(value = "污染物报警下限值", name = "LowValue")
    @N(integer = 14, fraction = 2, groups = VersionGroup.V2005.class)
    @JsonProperty("LowValue")
    @JsonbProperty("LowValue")
    private BigDecimal lowValue;

    @ApiModelProperty(value = "噪声监测日历史数据", name = "Data")
    @N(integer = 14, fraction = 2, groups = VersionGroup.V2005.class)
    @N(integer = 3, fraction = 1, groups = VersionGroup.V2017.class)
    @JsonProperty("Data")
    @JsonbProperty("Data")
    private String data;

    @ApiModelProperty(value = "噪声昼间历史数据", name = "DayData")
    @N(integer = 14, fraction = 2, groups = VersionGroup.V2005.class)
    @N(integer = 3, fraction = 1, groups = VersionGroup.V2017.class)
    @JsonProperty("DayData")
    @JsonbProperty("DayData")
    private String dayData;

    @ApiModelProperty(value = "噪声夜间历史数据", name = "NightData")
    @N(integer = 14, fraction = 2, groups = VersionGroup.V2005.class)
    @N(integer = 3, fraction = 1, groups = VersionGroup.V2017.class)
    @JsonProperty("NightData")
    @JsonbProperty("NightData")
    private String nightData;
    @ApiModelProperty("B 相电流 ")
    @JsonProperty("100000-Ib")
    @JsonbProperty("100000-Ib")
    private String Ib;
    @ApiModelProperty("A 相电流")
    @JsonProperty("100000-Ia")
    @JsonbProperty("100000-Ia")
    private String Ia;
    @ApiModelProperty("C 相电流")
    @JsonProperty("100000-Ic")
    @JsonbProperty("100000-Ic")
    private String Ic;
    @ApiModelProperty("A 相电压")
    @JsonProperty("100000-Ua")
    @JsonbProperty("100000-Ua")
    private String Ua;
    @ApiModelProperty("B 相电压")
    @JsonProperty("100000-Ub")
    @JsonbProperty("100000-Ub")
    private String Ub;
    @ApiModelProperty("C 相电压")
    @JsonProperty("100000-Uc")
    @JsonbProperty("100000-Uc")
    private String Uc;
    @ApiModelProperty("总有功功率")
    @JsonProperty("100000-Pt")
    @JsonbProperty("100000-Pt")
    private String Pt;
    @ApiModelProperty("A 相有功功率 ")
    @JsonProperty("100000-Pa")
    @JsonbProperty("100000-Pa")
    private String Pa;
    @ApiModelProperty("B 相有功功率")
    @JsonProperty("100000-Pb")
    @JsonbProperty("100000-Pb")
    private String Pb;
    @ApiModelProperty("C 相有功功率")
    @JsonProperty("100000-Pc")
    @JsonbProperty("100000-Pc")
    private String Pc;
    @ApiModelProperty("有功实时需量")
    @JsonProperty("100000-Pdem")
    @JsonbProperty("100000-Pdem")
    private String Pdem;
    @ApiModelProperty("总正向有功电能示值")
    @JsonProperty("100000-Ept")
    @JsonbProperty("100000-Ept")
    private String Ept;
    @ApiModelProperty("A 相正相有功电能示值 ")
    @JsonProperty("100000-Epa")
    @JsonbProperty("100000-Epa")
    private String Epa;
    @ApiModelProperty("B 相正相有功电能示值")
    @JsonProperty("100000-Epb")
    @JsonbProperty("100000-Epb")
    private String Epb;
    @ApiModelProperty("C 相正相有功电能示值")
    @JsonProperty("100000-Epc")
    @JsonbProperty("100000-Epc")
    private String Epc;
    @ApiModelProperty("第一象限无功电能示值")
    @JsonProperty("100000-Eg1")
    @JsonbProperty("100000-Eg1")
    private String Eg1;
    @ApiModelProperty("第二象限无功电能示值")
    @JsonProperty("100000-Eg2")
    @JsonbProperty("100000-Eg2")
    private String Eg2;
    @ApiModelProperty("第三象限无功电能示值")
    @JsonProperty("100000-Eg3")
    @JsonbProperty("100000-Eg3")
    private String Eg3;
    @ApiModelProperty("第四象限无功电能示值")
    @JsonProperty("100000-Eg4")
    @JsonbProperty("100000-Eg4")
    private String Eg4;
    @ApiModelProperty("A 相分钟平均有功功率")
    @JsonProperty("100000-Pa_ave")
    @JsonbProperty("100000-Pa_ave")
    private String Pa_ave;
    @ApiModelProperty("B 相分钟平均有功功率")
    @JsonProperty("100000-Pb_ave")
    @JsonbProperty("100000-Pb_ave")
    private String Pb_ave;
    @ApiModelProperty("C 相分钟平均有功功率")
    @JsonProperty("100000-Pc_ave")
    @JsonbProperty("100000-Pc_ave")
    private String Pc_ave;
    @ApiModelProperty("A 相温度")
    @JsonProperty("100000-Tpa")
    @JsonbProperty("100000-Tpa")
    private String Tpa;
    @ApiModelProperty("B 相温度")
    @JsonProperty("100000-Tpb")
    @JsonbProperty("100000-Tpb")
    private String Tpb;
    @ApiModelProperty("C 相温度")
    @JsonProperty("100000-Tpc")
    @JsonbProperty("100000-Tpc")
    private String Tpc;
    @ApiModelProperty("A 相功率角")
    @JsonProperty("100000-Pga")
    @JsonbProperty("100000-Pga")
    private String Pga;
    @ApiModelProperty("B 相功率角")
    @JsonProperty("100000-Pgb")
    @JsonbProperty("100000-Pgb")
    private String Pgb;
    @ApiModelProperty("C 相功率角")
    @JsonProperty("100000-Pgc")
    @JsonbProperty("100000-Pgc")
    private String Pgc;

    public String getIc() {
        return Ic;
    }

    public void setIc(String ic) {
        Ic = ic;
    }

    public String getUa() {
        return Ua;
    }

    public void setUa(String ua) {
        Ua = ua;
    }

    public String getUb() {
        return Ub;
    }

    public void setUb(String ub) {
        Ub = ub;
    }

    public String getUc() {
        return Uc;
    }

    public void setUc(String uc) {
        Uc = uc;
    }

    public String getPt() {
        return Pt;
    }

    public void setPt(String pt) {
        Pt = pt;
    }

    public String getPa() {
        return Pa;
    }

    public void setPa(String pa) {
        Pa = pa;
    }

    public String getPb() {
        return Pb;
    }

    public void setPb(String pb) {
        Pb = pb;
    }

    public String getPc() {
        return Pc;
    }

    public void setPc(String pc) {
        Pc = pc;
    }

    public String getPdem() {
        return Pdem;
    }

    public void setPdem(String pdem) {
        Pdem = pdem;
    }

    public String getEpt() {
        return Ept;
    }

    public void setEpt(String ept) {
        Ept = ept;
    }

    public String getEpa() {
        return Epa;
    }

    public void setEpa(String epa) {
        Epa = epa;
    }

    public String getEpb() {
        return Epb;
    }

    public void setEpb(String epb) {
        Epb = epb;
    }

    public String getEpc() {
        return Epc;
    }

    public void setEpc(String epc) {
        Epc = epc;
    }

    public String getEg1() {
        return Eg1;
    }

    public void setEg1(String eg1) {
        Eg1 = eg1;
    }

    public String getEg2() {
        return Eg2;
    }

    public void setEg2(String eg2) {
        Eg2 = eg2;
    }

    public String getEg3() {
        return Eg3;
    }

    public void setEg3(String eg3) {
        Eg3 = eg3;
    }

    public String getEg4() {
        return Eg4;
    }

    public void setEg4(String eg4) {
        Eg4 = eg4;
    }

    public String getPa_ave() {
        return Pa_ave;
    }

    public void setPa_ave(String pa_ave) {
        Pa_ave = pa_ave;
    }

    public String getPb_ave() {
        return Pb_ave;
    }

    public void setPb_ave(String pb_ave) {
        Pb_ave = pb_ave;
    }

    public String getPc_ave() {
        return Pc_ave;
    }

    public void setPc_ave(String pc_ave) {
        Pc_ave = pc_ave;
    }

    public String getTpa() {
        return Tpa;
    }

    public void setTpa(String tpa) {
        Tpa = tpa;
    }

    public String getTpb() {
        return Tpb;
    }

    public void setTpb(String tpb) {
        Tpb = tpb;
    }

    public String getTpc() {
        return Tpc;
    }

    public void setTpc(String tpc) {
        Tpc = tpc;
    }

    public String getPga() {
        return Pga;
    }

    public void setPga(String pga) {
        Pga = pga;
    }

    public String getPgb() {
        return Pgb;
    }

    public void setPgb(String pgb) {
        Pgb = pgb;
    }

    public String getPgc() {
        return Pgc;
    }

    public void setPgc(String pgc) {
        Pgc = pgc;
    }

    public String getIa() {
        return Ia;
    }

    public void setIa(String ia) {
        Ia = ia;
    }

    public String getIb() {
        return Ib;
    }

    public void setIb(String ib) {
        Ib = ib;
    }


    public String getSampleTime() {
        return sampleTime;
    }

    public void setSampleTime(String sampleTime) {
        this.sampleTime = sampleTime;
    }

    public BigDecimal getRtd() {
        return rtd;
    }

    public void setRtd(BigDecimal rtd) {
        this.rtd = rtd;
    }

    public BigDecimal getMin() {
        return min;
    }

    public void setMin(BigDecimal min) {
        this.min = min;
    }

    public BigDecimal getAvg() {
        return avg;
    }

    public void setAvg(BigDecimal avg) {
        this.avg = avg;
    }

    public BigDecimal getMax() {
        return max;
    }

    public void setMax(BigDecimal max) {
        this.max = max;
    }

    public BigDecimal getZsRtd() {
        return zsRtd;
    }

    public void setZsRtd(BigDecimal zsRtd) {
        this.zsRtd = zsRtd;
    }

    public BigDecimal getZsMin() {
        return zsMin;
    }

    public void setZsMin(BigDecimal zsMin) {
        this.zsMin = zsMin;
    }

    public BigDecimal getZsAvg() {
        return zsAvg;
    }

    public void setZsAvg(BigDecimal zsAvg) {
        this.zsAvg = zsAvg;
    }

    public BigDecimal getZsMax() {
        return zsMax;
    }

    public void setZsMax(BigDecimal zsMax) {
        this.zsMax = zsMax;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String geteFlag() {
        return eFlag;
    }

    public void seteFlag(String eFlag) {
        this.eFlag = eFlag;
    }

    public BigDecimal getCou() {
        return cou;
    }

    public void setCou(BigDecimal cou) {
        this.cou = cou;
    }

    public Integer getRs() {
        return rs;
    }

    public void setRs(Integer rs) {
        this.rs = rs;
    }

    public BigDecimal getRt() {
        return rt;
    }

    public void setRt(BigDecimal rt) {
        this.rt = rt;
    }

    public BigDecimal getAla() {
        return ala;
    }

    public void setAla(BigDecimal ala) {
        this.ala = ala;
    }

    public BigDecimal getUpValue() {
        return upValue;
    }

    public void setUpValue(BigDecimal upValue) {
        this.upValue = upValue;
    }

    public BigDecimal getLowValue() {
        return lowValue;
    }

    public void setLowValue(BigDecimal lowValue) {
        this.lowValue = lowValue;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDayData() {
        return dayData;
    }

    public void setDayData(String dayData) {
        this.dayData = dayData;
    }

    public String getNightData() {
        return nightData;
    }

    public void setNightData(String nightData) {
        this.nightData = nightData;
    }
}
