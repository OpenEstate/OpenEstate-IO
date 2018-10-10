
package org.openestate.io.is24_xml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ISOLaenderCodeTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ISOLaenderCodeTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;length value="3"/&gt;
 *     &lt;whiteSpace value="collapse"/&gt;
 *     &lt;enumeration value="AFG"/&gt;
 *     &lt;enumeration value="ALB"/&gt;
 *     &lt;enumeration value="DZA"/&gt;
 *     &lt;enumeration value="ASM"/&gt;
 *     &lt;enumeration value="AND"/&gt;
 *     &lt;enumeration value="AGO"/&gt;
 *     &lt;enumeration value="AIA"/&gt;
 *     &lt;enumeration value="ATG"/&gt;
 *     &lt;enumeration value="ARG"/&gt;
 *     &lt;enumeration value="ARM"/&gt;
 *     &lt;enumeration value="ABW"/&gt;
 *     &lt;enumeration value="AUS"/&gt;
 *     &lt;enumeration value="AUT"/&gt;
 *     &lt;enumeration value="AZE"/&gt;
 *     &lt;enumeration value="BHS"/&gt;
 *     &lt;enumeration value="BHR"/&gt;
 *     &lt;enumeration value="BGD"/&gt;
 *     &lt;enumeration value="BRB"/&gt;
 *     &lt;enumeration value="BLR"/&gt;
 *     &lt;enumeration value="BEL"/&gt;
 *     &lt;enumeration value="BLZ"/&gt;
 *     &lt;enumeration value="BEN"/&gt;
 *     &lt;enumeration value="BMU"/&gt;
 *     &lt;enumeration value="BTN"/&gt;
 *     &lt;enumeration value="BOL"/&gt;
 *     &lt;enumeration value="BIH"/&gt;
 *     &lt;enumeration value="BWA"/&gt;
 *     &lt;enumeration value="BRA"/&gt;
 *     &lt;enumeration value="VGB"/&gt;
 *     &lt;enumeration value="BRN"/&gt;
 *     &lt;enumeration value="BGR"/&gt;
 *     &lt;enumeration value="BFA"/&gt;
 *     &lt;enumeration value="BDI"/&gt;
 *     &lt;enumeration value="KHM"/&gt;
 *     &lt;enumeration value="CMR"/&gt;
 *     &lt;enumeration value="CAN"/&gt;
 *     &lt;enumeration value="CPV"/&gt;
 *     &lt;enumeration value="CYM"/&gt;
 *     &lt;enumeration value="CAF"/&gt;
 *     &lt;enumeration value="TCD"/&gt;
 *     &lt;enumeration value="CHL"/&gt;
 *     &lt;enumeration value="CHN"/&gt;
 *     &lt;enumeration value="HKG"/&gt;
 *     &lt;enumeration value="MAC"/&gt;
 *     &lt;enumeration value="COL"/&gt;
 *     &lt;enumeration value="COM"/&gt;
 *     &lt;enumeration value="COG"/&gt;
 *     &lt;enumeration value="COK"/&gt;
 *     &lt;enumeration value="CRI"/&gt;
 *     &lt;enumeration value="CIV"/&gt;
 *     &lt;enumeration value="HRV"/&gt;
 *     &lt;enumeration value="CUB"/&gt;
 *     &lt;enumeration value="CYP"/&gt;
 *     &lt;enumeration value="CZE"/&gt;
 *     &lt;enumeration value="PRK"/&gt;
 *     &lt;enumeration value="COD"/&gt;
 *     &lt;enumeration value="DNK"/&gt;
 *     &lt;enumeration value="DJI"/&gt;
 *     &lt;enumeration value="DMA"/&gt;
 *     &lt;enumeration value="DOM"/&gt;
 *     &lt;enumeration value="TMP"/&gt;
 *     &lt;enumeration value="ECU"/&gt;
 *     &lt;enumeration value="EGY"/&gt;
 *     &lt;enumeration value="SLV"/&gt;
 *     &lt;enumeration value="GNQ"/&gt;
 *     &lt;enumeration value="ERI"/&gt;
 *     &lt;enumeration value="EST"/&gt;
 *     &lt;enumeration value="ETH"/&gt;
 *     &lt;enumeration value="FRO"/&gt;
 *     &lt;enumeration value="FLK"/&gt;
 *     &lt;enumeration value="FJI"/&gt;
 *     &lt;enumeration value="FIN"/&gt;
 *     &lt;enumeration value="FRA"/&gt;
 *     &lt;enumeration value="GUF"/&gt;
 *     &lt;enumeration value="PYF"/&gt;
 *     &lt;enumeration value="GAB"/&gt;
 *     &lt;enumeration value="GMB"/&gt;
 *     &lt;enumeration value="GEO"/&gt;
 *     &lt;enumeration value="DEU"/&gt;
 *     &lt;enumeration value="GHA"/&gt;
 *     &lt;enumeration value="GIB"/&gt;
 *     &lt;enumeration value="GRC"/&gt;
 *     &lt;enumeration value="GRL"/&gt;
 *     &lt;enumeration value="GRD"/&gt;
 *     &lt;enumeration value="GLP"/&gt;
 *     &lt;enumeration value="GUM"/&gt;
 *     &lt;enumeration value="GTM"/&gt;
 *     &lt;enumeration value="GIN"/&gt;
 *     &lt;enumeration value="GNB"/&gt;
 *     &lt;enumeration value="GUY"/&gt;
 *     &lt;enumeration value="HTI"/&gt;
 *     &lt;enumeration value="VAT"/&gt;
 *     &lt;enumeration value="HND"/&gt;
 *     &lt;enumeration value="HUN"/&gt;
 *     &lt;enumeration value="ISL"/&gt;
 *     &lt;enumeration value="IND"/&gt;
 *     &lt;enumeration value="IDN"/&gt;
 *     &lt;enumeration value="IRN"/&gt;
 *     &lt;enumeration value="IRQ"/&gt;
 *     &lt;enumeration value="IRL"/&gt;
 *     &lt;enumeration value="ISR"/&gt;
 *     &lt;enumeration value="ITA"/&gt;
 *     &lt;enumeration value="JAM"/&gt;
 *     &lt;enumeration value="JPN"/&gt;
 *     &lt;enumeration value="JOR"/&gt;
 *     &lt;enumeration value="KAZ"/&gt;
 *     &lt;enumeration value="KEN"/&gt;
 *     &lt;enumeration value="KIR"/&gt;
 *     &lt;enumeration value="KWT"/&gt;
 *     &lt;enumeration value="KGZ"/&gt;
 *     &lt;enumeration value="LAO"/&gt;
 *     &lt;enumeration value="LVA"/&gt;
 *     &lt;enumeration value="LBN"/&gt;
 *     &lt;enumeration value="LSO"/&gt;
 *     &lt;enumeration value="LBR"/&gt;
 *     &lt;enumeration value="LBY"/&gt;
 *     &lt;enumeration value="LIE"/&gt;
 *     &lt;enumeration value="LTU"/&gt;
 *     &lt;enumeration value="LUX"/&gt;
 *     &lt;enumeration value="MDG"/&gt;
 *     &lt;enumeration value="MWI"/&gt;
 *     &lt;enumeration value="MYS"/&gt;
 *     &lt;enumeration value="MDV"/&gt;
 *     &lt;enumeration value="MLI"/&gt;
 *     &lt;enumeration value="MLT"/&gt;
 *     &lt;enumeration value="MHL"/&gt;
 *     &lt;enumeration value="MTQ"/&gt;
 *     &lt;enumeration value="MRT"/&gt;
 *     &lt;enumeration value="MUS"/&gt;
 *     &lt;enumeration value="MEX"/&gt;
 *     &lt;enumeration value="FSM"/&gt;
 *     &lt;enumeration value="MCO"/&gt;
 *     &lt;enumeration value="MNG"/&gt;
 *     &lt;enumeration value="MSR"/&gt;
 *     &lt;enumeration value="MAR"/&gt;
 *     &lt;enumeration value="MOZ"/&gt;
 *     &lt;enumeration value="MMR"/&gt;
 *     &lt;enumeration value="NAM"/&gt;
 *     &lt;enumeration value="NRU"/&gt;
 *     &lt;enumeration value="NPL"/&gt;
 *     &lt;enumeration value="NLD"/&gt;
 *     &lt;enumeration value="ANT"/&gt;
 *     &lt;enumeration value="NCL"/&gt;
 *     &lt;enumeration value="NZL"/&gt;
 *     &lt;enumeration value="NIC"/&gt;
 *     &lt;enumeration value="NER"/&gt;
 *     &lt;enumeration value="NGA"/&gt;
 *     &lt;enumeration value="NIU"/&gt;
 *     &lt;enumeration value="NFK"/&gt;
 *     &lt;enumeration value="MNP"/&gt;
 *     &lt;enumeration value="NOR"/&gt;
 *     &lt;enumeration value="PSE"/&gt;
 *     &lt;enumeration value="OMN"/&gt;
 *     &lt;enumeration value="PAK"/&gt;
 *     &lt;enumeration value="PLW"/&gt;
 *     &lt;enumeration value="PAN"/&gt;
 *     &lt;enumeration value="PNG"/&gt;
 *     &lt;enumeration value="PRY"/&gt;
 *     &lt;enumeration value="PER"/&gt;
 *     &lt;enumeration value="PHL"/&gt;
 *     &lt;enumeration value="PCN"/&gt;
 *     &lt;enumeration value="POL"/&gt;
 *     &lt;enumeration value="PRT"/&gt;
 *     &lt;enumeration value="PRI"/&gt;
 *     &lt;enumeration value="QAT"/&gt;
 *     &lt;enumeration value="KOR"/&gt;
 *     &lt;enumeration value="MDA"/&gt;
 *     &lt;enumeration value="REU"/&gt;
 *     &lt;enumeration value="ROU"/&gt;
 *     &lt;enumeration value="RUS"/&gt;
 *     &lt;enumeration value="RWA"/&gt;
 *     &lt;enumeration value="SHN"/&gt;
 *     &lt;enumeration value="KNA"/&gt;
 *     &lt;enumeration value="LCA"/&gt;
 *     &lt;enumeration value="SPM"/&gt;
 *     &lt;enumeration value="VCT"/&gt;
 *     &lt;enumeration value="WSM"/&gt;
 *     &lt;enumeration value="SMR"/&gt;
 *     &lt;enumeration value="STP"/&gt;
 *     &lt;enumeration value="SAU"/&gt;
 *     &lt;enumeration value="SEN"/&gt;
 *     &lt;enumeration value="SYC"/&gt;
 *     &lt;enumeration value="SLE"/&gt;
 *     &lt;enumeration value="SGP"/&gt;
 *     &lt;enumeration value="SVK"/&gt;
 *     &lt;enumeration value="SVN"/&gt;
 *     &lt;enumeration value="SLB"/&gt;
 *     &lt;enumeration value="SOM"/&gt;
 *     &lt;enumeration value="ZAF"/&gt;
 *     &lt;enumeration value="ESP"/&gt;
 *     &lt;enumeration value="LKA"/&gt;
 *     &lt;enumeration value="SDN"/&gt;
 *     &lt;enumeration value="SUR"/&gt;
 *     &lt;enumeration value="SJM"/&gt;
 *     &lt;enumeration value="SWZ"/&gt;
 *     &lt;enumeration value="SWE"/&gt;
 *     &lt;enumeration value="CHE"/&gt;
 *     &lt;enumeration value="SYR"/&gt;
 *     &lt;enumeration value="TWN"/&gt;
 *     &lt;enumeration value="TJK"/&gt;
 *     &lt;enumeration value="THA"/&gt;
 *     &lt;enumeration value="MKD"/&gt;
 *     &lt;enumeration value="TGO"/&gt;
 *     &lt;enumeration value="TKL"/&gt;
 *     &lt;enumeration value="TON"/&gt;
 *     &lt;enumeration value="TTO"/&gt;
 *     &lt;enumeration value="TUN"/&gt;
 *     &lt;enumeration value="TUR"/&gt;
 *     &lt;enumeration value="TKM"/&gt;
 *     &lt;enumeration value="TCA"/&gt;
 *     &lt;enumeration value="TUV"/&gt;
 *     &lt;enumeration value="UGA"/&gt;
 *     &lt;enumeration value="UKR"/&gt;
 *     &lt;enumeration value="ARE"/&gt;
 *     &lt;enumeration value="GBR"/&gt;
 *     &lt;enumeration value="TZA"/&gt;
 *     &lt;enumeration value="USA"/&gt;
 *     &lt;enumeration value="VIR"/&gt;
 *     &lt;enumeration value="URY"/&gt;
 *     &lt;enumeration value="UZB"/&gt;
 *     &lt;enumeration value="VUT"/&gt;
 *     &lt;enumeration value="VEN"/&gt;
 *     &lt;enumeration value="VNM"/&gt;
 *     &lt;enumeration value="WLF"/&gt;
 *     &lt;enumeration value="ESH"/&gt;
 *     &lt;enumeration value="YEM"/&gt;
 *     &lt;enumeration value="SCG"/&gt;
 *     &lt;enumeration value="ZMB"/&gt;
 *     &lt;enumeration value="ZWE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ISOLaenderCodeTyp")
@XmlEnum
public enum ISOLaenderCodeTyp {

    AFG,
    ALB,
    DZA,
    ASM,
    AND,
    AGO,
    AIA,
    ATG,
    ARG,
    ARM,
    ABW,
    AUS,
    AUT,
    AZE,
    BHS,
    BHR,
    BGD,
    BRB,
    BLR,
    BEL,
    BLZ,
    BEN,
    BMU,
    BTN,
    BOL,
    BIH,
    BWA,
    BRA,
    VGB,
    BRN,
    BGR,
    BFA,
    BDI,
    KHM,
    CMR,
    CAN,
    CPV,
    CYM,
    CAF,
    TCD,
    CHL,
    CHN,
    HKG,
    MAC,
    COL,
    COM,
    COG,
    COK,
    CRI,
    CIV,
    HRV,
    CUB,
    CYP,
    CZE,
    PRK,
    COD,
    DNK,
    DJI,
    DMA,
    DOM,
    TMP,
    ECU,
    EGY,
    SLV,
    GNQ,
    ERI,
    EST,
    ETH,
    FRO,
    FLK,
    FJI,
    FIN,
    FRA,
    GUF,
    PYF,
    GAB,
    GMB,
    GEO,
    DEU,
    GHA,
    GIB,
    GRC,
    GRL,
    GRD,
    GLP,
    GUM,
    GTM,
    GIN,
    GNB,
    GUY,
    HTI,
    VAT,
    HND,
    HUN,
    ISL,
    IND,
    IDN,
    IRN,
    IRQ,
    IRL,
    ISR,
    ITA,
    JAM,
    JPN,
    JOR,
    KAZ,
    KEN,
    KIR,
    KWT,
    KGZ,
    LAO,
    LVA,
    LBN,
    LSO,
    LBR,
    LBY,
    LIE,
    LTU,
    LUX,
    MDG,
    MWI,
    MYS,
    MDV,
    MLI,
    MLT,
    MHL,
    MTQ,
    MRT,
    MUS,
    MEX,
    FSM,
    MCO,
    MNG,
    MSR,
    MAR,
    MOZ,
    MMR,
    NAM,
    NRU,
    NPL,
    NLD,
    ANT,
    NCL,
    NZL,
    NIC,
    NER,
    NGA,
    NIU,
    NFK,
    MNP,
    NOR,
    PSE,
    OMN,
    PAK,
    PLW,
    PAN,
    PNG,
    PRY,
    PER,
    PHL,
    PCN,
    POL,
    PRT,
    PRI,
    QAT,
    KOR,
    MDA,
    REU,
    ROU,
    RUS,
    RWA,
    SHN,
    KNA,
    LCA,
    SPM,
    VCT,
    WSM,
    SMR,
    STP,
    SAU,
    SEN,
    SYC,
    SLE,
    SGP,
    SVK,
    SVN,
    SLB,
    SOM,
    ZAF,
    ESP,
    LKA,
    SDN,
    SUR,
    SJM,
    SWZ,
    SWE,
    CHE,
    SYR,
    TWN,
    TJK,
    THA,
    MKD,
    TGO,
    TKL,
    TON,
    TTO,
    TUN,
    TUR,
    TKM,
    TCA,
    TUV,
    UGA,
    UKR,
    ARE,
    GBR,
    TZA,
    USA,
    VIR,
    URY,
    UZB,
    VUT,
    VEN,
    VNM,
    WLF,
    ESH,
    YEM,
    SCG,
    ZMB,
    ZWE;

    public String value() {
        return name();
    }

    public static ISOLaenderCodeTyp fromValue(String v) {
        return valueOf(v);
    }

}
