package com.netsuite.suitetalk.proxy.v2018_1.platform.common.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class Country implements Serializable {
   private String _value_;
   private static HashMap _table_ = new HashMap();
   public static final String __afghanistan = "_afghanistan";
   public static final String __alandIslands = "_alandIslands";
   public static final String __albania = "_albania";
   public static final String __algeria = "_algeria";
   public static final String __americanSamoa = "_americanSamoa";
   public static final String __andorra = "_andorra";
   public static final String __angola = "_angola";
   public static final String __anguilla = "_anguilla";
   public static final String __antarctica = "_antarctica";
   public static final String __antiguaAndBarbuda = "_antiguaAndBarbuda";
   public static final String __argentina = "_argentina";
   public static final String __armenia = "_armenia";
   public static final String __aruba = "_aruba";
   public static final String __australia = "_australia";
   public static final String __austria = "_austria";
   public static final String __azerbaijan = "_azerbaijan";
   public static final String __bahamas = "_bahamas";
   public static final String __bahrain = "_bahrain";
   public static final String __bangladesh = "_bangladesh";
   public static final String __barbados = "_barbados";
   public static final String __belarus = "_belarus";
   public static final String __belgium = "_belgium";
   public static final String __belize = "_belize";
   public static final String __benin = "_benin";
   public static final String __bermuda = "_bermuda";
   public static final String __bhutan = "_bhutan";
   public static final String __bolivia = "_bolivia";
   public static final String __bonaireSaintEustatiusAndSaba = "_bonaireSaintEustatiusAndSaba";
   public static final String __bosniaAndHerzegovina = "_bosniaAndHerzegovina";
   public static final String __botswana = "_botswana";
   public static final String __bouvetIsland = "_bouvetIsland";
   public static final String __brazil = "_brazil";
   public static final String __britishIndianOceanTerritory = "_britishIndianOceanTerritory";
   public static final String __bruneiDarussalam = "_bruneiDarussalam";
   public static final String __bulgaria = "_bulgaria";
   public static final String __burkinaFaso = "_burkinaFaso";
   public static final String __burundi = "_burundi";
   public static final String __cambodia = "_cambodia";
   public static final String __cameroon = "_cameroon";
   public static final String __canada = "_canada";
   public static final String __canaryIslands = "_canaryIslands";
   public static final String __capeVerde = "_capeVerde";
   public static final String __caymanIslands = "_caymanIslands";
   public static final String __centralAfricanRepublic = "_centralAfricanRepublic";
   public static final String __ceutaAndMelilla = "_ceutaAndMelilla";
   public static final String __chad = "_chad";
   public static final String __chile = "_chile";
   public static final String __china = "_china";
   public static final String __christmasIsland = "_christmasIsland";
   public static final String __cocosKeelingIslands = "_cocosKeelingIslands";
   public static final String __colombia = "_colombia";
   public static final String __comoros = "_comoros";
   public static final String __congoDemocraticPeoplesRepublic = "_congoDemocraticPeoplesRepublic";
   public static final String __congoRepublicOf = "_congoRepublicOf";
   public static final String __cookIslands = "_cookIslands";
   public static final String __costaRica = "_costaRica";
   public static final String __coteDIvoire = "_coteDIvoire";
   public static final String __croatiaHrvatska = "_croatiaHrvatska";
   public static final String __cuba = "_cuba";
   public static final String __curacao = "_curacao";
   public static final String __cyprus = "_cyprus";
   public static final String __czechRepublic = "_czechRepublic";
   public static final String __denmark = "_denmark";
   public static final String __djibouti = "_djibouti";
   public static final String __dominica = "_dominica";
   public static final String __dominicanRepublic = "_dominicanRepublic";
   public static final String __eastTimor = "_eastTimor";
   public static final String __ecuador = "_ecuador";
   public static final String __egypt = "_egypt";
   public static final String __elSalvador = "_elSalvador";
   public static final String __equatorialGuinea = "_equatorialGuinea";
   public static final String __eritrea = "_eritrea";
   public static final String __estonia = "_estonia";
   public static final String __ethiopia = "_ethiopia";
   public static final String __falklandIslands = "_falklandIslands";
   public static final String __faroeIslands = "_faroeIslands";
   public static final String __fiji = "_fiji";
   public static final String __finland = "_finland";
   public static final String __france = "_france";
   public static final String __frenchGuiana = "_frenchGuiana";
   public static final String __frenchPolynesia = "_frenchPolynesia";
   public static final String __frenchSouthernTerritories = "_frenchSouthernTerritories";
   public static final String __gabon = "_gabon";
   public static final String __gambia = "_gambia";
   public static final String __georgia = "_georgia";
   public static final String __germany = "_germany";
   public static final String __ghana = "_ghana";
   public static final String __gibraltar = "_gibraltar";
   public static final String __greece = "_greece";
   public static final String __greenland = "_greenland";
   public static final String __grenada = "_grenada";
   public static final String __guadeloupe = "_guadeloupe";
   public static final String __guam = "_guam";
   public static final String __guatemala = "_guatemala";
   public static final String __guernsey = "_guernsey";
   public static final String __guinea = "_guinea";
   public static final String __guineaBissau = "_guineaBissau";
   public static final String __guyana = "_guyana";
   public static final String __haiti = "_haiti";
   public static final String __heardAndMcDonaldIslands = "_heardAndMcDonaldIslands";
   public static final String __holySeeCityVaticanState = "_holySeeCityVaticanState";
   public static final String __honduras = "_honduras";
   public static final String __hongKong = "_hongKong";
   public static final String __hungary = "_hungary";
   public static final String __iceland = "_iceland";
   public static final String __india = "_india";
   public static final String __indonesia = "_indonesia";
   public static final String __iranIslamicRepublicOf = "_iranIslamicRepublicOf";
   public static final String __iraq = "_iraq";
   public static final String __ireland = "_ireland";
   public static final String __isleOfMan = "_isleOfMan";
   public static final String __israel = "_israel";
   public static final String __italy = "_italy";
   public static final String __jamaica = "_jamaica";
   public static final String __japan = "_japan";
   public static final String __jersey = "_jersey";
   public static final String __jordan = "_jordan";
   public static final String __kazakhstan = "_kazakhstan";
   public static final String __kenya = "_kenya";
   public static final String __kiribati = "_kiribati";
   public static final String __koreaDemocraticPeoplesRepublic = "_koreaDemocraticPeoplesRepublic";
   public static final String __koreaRepublicOf = "_koreaRepublicOf";
   public static final String __kosovo = "_kosovo";
   public static final String __kuwait = "_kuwait";
   public static final String __kyrgyzstan = "_kyrgyzstan";
   public static final String __laoPeoplesDemocraticRepublic = "_laoPeoplesDemocraticRepublic";
   public static final String __latvia = "_latvia";
   public static final String __lebanon = "_lebanon";
   public static final String __lesotho = "_lesotho";
   public static final String __liberia = "_liberia";
   public static final String __libya = "_libya";
   public static final String __liechtenstein = "_liechtenstein";
   public static final String __lithuania = "_lithuania";
   public static final String __luxembourg = "_luxembourg";
   public static final String __macau = "_macau";
   public static final String __macedonia = "_macedonia";
   public static final String __madagascar = "_madagascar";
   public static final String __malawi = "_malawi";
   public static final String __malaysia = "_malaysia";
   public static final String __maldives = "_maldives";
   public static final String __mali = "_mali";
   public static final String __malta = "_malta";
   public static final String __marshallIslands = "_marshallIslands";
   public static final String __martinique = "_martinique";
   public static final String __mauritania = "_mauritania";
   public static final String __mauritius = "_mauritius";
   public static final String __mayotte = "_mayotte";
   public static final String __mexico = "_mexico";
   public static final String __micronesiaFederalStateOf = "_micronesiaFederalStateOf";
   public static final String __moldovaRepublicOf = "_moldovaRepublicOf";
   public static final String __monaco = "_monaco";
   public static final String __mongolia = "_mongolia";
   public static final String __montenegro = "_montenegro";
   public static final String __montserrat = "_montserrat";
   public static final String __morocco = "_morocco";
   public static final String __mozambique = "_mozambique";
   public static final String __myanmar = "_myanmar";
   public static final String __namibia = "_namibia";
   public static final String __nauru = "_nauru";
   public static final String __nepal = "_nepal";
   public static final String __netherlands = "_netherlands";
   public static final String __newCaledonia = "_newCaledonia";
   public static final String __newZealand = "_newZealand";
   public static final String __nicaragua = "_nicaragua";
   public static final String __niger = "_niger";
   public static final String __nigeria = "_nigeria";
   public static final String __niue = "_niue";
   public static final String __norfolkIsland = "_norfolkIsland";
   public static final String __northernMarianaIslands = "_northernMarianaIslands";
   public static final String __norway = "_norway";
   public static final String __oman = "_oman";
   public static final String __pakistan = "_pakistan";
   public static final String __palau = "_palau";
   public static final String __panama = "_panama";
   public static final String __papuaNewGuinea = "_papuaNewGuinea";
   public static final String __paraguay = "_paraguay";
   public static final String __peru = "_peru";
   public static final String __philippines = "_philippines";
   public static final String __pitcairnIsland = "_pitcairnIsland";
   public static final String __poland = "_poland";
   public static final String __portugal = "_portugal";
   public static final String __puertoRico = "_puertoRico";
   public static final String __qatar = "_qatar";
   public static final String __reunionIsland = "_reunionIsland";
   public static final String __romania = "_romania";
   public static final String __russianFederation = "_russianFederation";
   public static final String __rwanda = "_rwanda";
   public static final String __saintBarthelemy = "_saintBarthelemy";
   public static final String __saintHelena = "_saintHelena";
   public static final String __saintKittsAndNevis = "_saintKittsAndNevis";
   public static final String __saintLucia = "_saintLucia";
   public static final String __saintMartin = "_saintMartin";
   public static final String __saintVincentAndTheGrenadines = "_saintVincentAndTheGrenadines";
   public static final String __samoa = "_samoa";
   public static final String __sanMarino = "_sanMarino";
   public static final String __saoTomeAndPrincipe = "_saoTomeAndPrincipe";
   public static final String __saudiArabia = "_saudiArabia";
   public static final String __senegal = "_senegal";
   public static final String __serbia = "_serbia";
   public static final String __seychelles = "_seychelles";
   public static final String __sierraLeone = "_sierraLeone";
   public static final String __singapore = "_singapore";
   public static final String __sintMaarten = "_sintMaarten";
   public static final String __slovakRepublic = "_slovakRepublic";
   public static final String __slovenia = "_slovenia";
   public static final String __solomonIslands = "_solomonIslands";
   public static final String __somalia = "_somalia";
   public static final String __southAfrica = "_southAfrica";
   public static final String __southGeorgia = "_southGeorgia";
   public static final String __southSudan = "_southSudan";
   public static final String __spain = "_spain";
   public static final String __sriLanka = "_sriLanka";
   public static final String __stateOfPalestine = "_stateOfPalestine";
   public static final String __stPierreAndMiquelon = "_stPierreAndMiquelon";
   public static final String __sudan = "_sudan";
   public static final String __suriname = "_suriname";
   public static final String __svalbardAndJanMayenIslands = "_svalbardAndJanMayenIslands";
   public static final String __swaziland = "_swaziland";
   public static final String __sweden = "_sweden";
   public static final String __switzerland = "_switzerland";
   public static final String __syrianArabRepublic = "_syrianArabRepublic";
   public static final String __taiwan = "_taiwan";
   public static final String __tajikistan = "_tajikistan";
   public static final String __tanzania = "_tanzania";
   public static final String __thailand = "_thailand";
   public static final String __togo = "_togo";
   public static final String __tokelau = "_tokelau";
   public static final String __tonga = "_tonga";
   public static final String __trinidadAndTobago = "_trinidadAndTobago";
   public static final String __tunisia = "_tunisia";
   public static final String __turkey = "_turkey";
   public static final String __turkmenistan = "_turkmenistan";
   public static final String __turksAndCaicosIslands = "_turksAndCaicosIslands";
   public static final String __tuvalu = "_tuvalu";
   public static final String __uganda = "_uganda";
   public static final String __ukraine = "_ukraine";
   public static final String __unitedArabEmirates = "_unitedArabEmirates";
   public static final String __unitedKingdom = "_unitedKingdom";
   public static final String __unitedStates = "_unitedStates";
   public static final String __uruguay = "_uruguay";
   public static final String __uSMinorOutlyingIslands = "_uSMinorOutlyingIslands";
   public static final String __uzbekistan = "_uzbekistan";
   public static final String __vanuatu = "_vanuatu";
   public static final String __venezuela = "_venezuela";
   public static final String __vietnam = "_vietnam";
   public static final String __virginIslandsBritish = "_virginIslandsBritish";
   public static final String __virginIslandsUSA = "_virginIslandsUSA";
   public static final String __wallisAndFutunaIslands = "_wallisAndFutunaIslands";
   public static final String __westernSahara = "_westernSahara";
   public static final String __yemen = "_yemen";
   public static final String __zambia = "_zambia";
   public static final String __zimbabwe = "_zimbabwe";
   public static final Country _afghanistan = new Country("_afghanistan");
   public static final Country _alandIslands = new Country("_alandIslands");
   public static final Country _albania = new Country("_albania");
   public static final Country _algeria = new Country("_algeria");
   public static final Country _americanSamoa = new Country("_americanSamoa");
   public static final Country _andorra = new Country("_andorra");
   public static final Country _angola = new Country("_angola");
   public static final Country _anguilla = new Country("_anguilla");
   public static final Country _antarctica = new Country("_antarctica");
   public static final Country _antiguaAndBarbuda = new Country("_antiguaAndBarbuda");
   public static final Country _argentina = new Country("_argentina");
   public static final Country _armenia = new Country("_armenia");
   public static final Country _aruba = new Country("_aruba");
   public static final Country _australia = new Country("_australia");
   public static final Country _austria = new Country("_austria");
   public static final Country _azerbaijan = new Country("_azerbaijan");
   public static final Country _bahamas = new Country("_bahamas");
   public static final Country _bahrain = new Country("_bahrain");
   public static final Country _bangladesh = new Country("_bangladesh");
   public static final Country _barbados = new Country("_barbados");
   public static final Country _belarus = new Country("_belarus");
   public static final Country _belgium = new Country("_belgium");
   public static final Country _belize = new Country("_belize");
   public static final Country _benin = new Country("_benin");
   public static final Country _bermuda = new Country("_bermuda");
   public static final Country _bhutan = new Country("_bhutan");
   public static final Country _bolivia = new Country("_bolivia");
   public static final Country _bonaireSaintEustatiusAndSaba = new Country("_bonaireSaintEustatiusAndSaba");
   public static final Country _bosniaAndHerzegovina = new Country("_bosniaAndHerzegovina");
   public static final Country _botswana = new Country("_botswana");
   public static final Country _bouvetIsland = new Country("_bouvetIsland");
   public static final Country _brazil = new Country("_brazil");
   public static final Country _britishIndianOceanTerritory = new Country("_britishIndianOceanTerritory");
   public static final Country _bruneiDarussalam = new Country("_bruneiDarussalam");
   public static final Country _bulgaria = new Country("_bulgaria");
   public static final Country _burkinaFaso = new Country("_burkinaFaso");
   public static final Country _burundi = new Country("_burundi");
   public static final Country _cambodia = new Country("_cambodia");
   public static final Country _cameroon = new Country("_cameroon");
   public static final Country _canada = new Country("_canada");
   public static final Country _canaryIslands = new Country("_canaryIslands");
   public static final Country _capeVerde = new Country("_capeVerde");
   public static final Country _caymanIslands = new Country("_caymanIslands");
   public static final Country _centralAfricanRepublic = new Country("_centralAfricanRepublic");
   public static final Country _ceutaAndMelilla = new Country("_ceutaAndMelilla");
   public static final Country _chad = new Country("_chad");
   public static final Country _chile = new Country("_chile");
   public static final Country _china = new Country("_china");
   public static final Country _christmasIsland = new Country("_christmasIsland");
   public static final Country _cocosKeelingIslands = new Country("_cocosKeelingIslands");
   public static final Country _colombia = new Country("_colombia");
   public static final Country _comoros = new Country("_comoros");
   public static final Country _congoDemocraticPeoplesRepublic = new Country("_congoDemocraticPeoplesRepublic");
   public static final Country _congoRepublicOf = new Country("_congoRepublicOf");
   public static final Country _cookIslands = new Country("_cookIslands");
   public static final Country _costaRica = new Country("_costaRica");
   public static final Country _coteDIvoire = new Country("_coteDIvoire");
   public static final Country _croatiaHrvatska = new Country("_croatiaHrvatska");
   public static final Country _cuba = new Country("_cuba");
   public static final Country _curacao = new Country("_curacao");
   public static final Country _cyprus = new Country("_cyprus");
   public static final Country _czechRepublic = new Country("_czechRepublic");
   public static final Country _denmark = new Country("_denmark");
   public static final Country _djibouti = new Country("_djibouti");
   public static final Country _dominica = new Country("_dominica");
   public static final Country _dominicanRepublic = new Country("_dominicanRepublic");
   public static final Country _eastTimor = new Country("_eastTimor");
   public static final Country _ecuador = new Country("_ecuador");
   public static final Country _egypt = new Country("_egypt");
   public static final Country _elSalvador = new Country("_elSalvador");
   public static final Country _equatorialGuinea = new Country("_equatorialGuinea");
   public static final Country _eritrea = new Country("_eritrea");
   public static final Country _estonia = new Country("_estonia");
   public static final Country _ethiopia = new Country("_ethiopia");
   public static final Country _falklandIslands = new Country("_falklandIslands");
   public static final Country _faroeIslands = new Country("_faroeIslands");
   public static final Country _fiji = new Country("_fiji");
   public static final Country _finland = new Country("_finland");
   public static final Country _france = new Country("_france");
   public static final Country _frenchGuiana = new Country("_frenchGuiana");
   public static final Country _frenchPolynesia = new Country("_frenchPolynesia");
   public static final Country _frenchSouthernTerritories = new Country("_frenchSouthernTerritories");
   public static final Country _gabon = new Country("_gabon");
   public static final Country _gambia = new Country("_gambia");
   public static final Country _georgia = new Country("_georgia");
   public static final Country _germany = new Country("_germany");
   public static final Country _ghana = new Country("_ghana");
   public static final Country _gibraltar = new Country("_gibraltar");
   public static final Country _greece = new Country("_greece");
   public static final Country _greenland = new Country("_greenland");
   public static final Country _grenada = new Country("_grenada");
   public static final Country _guadeloupe = new Country("_guadeloupe");
   public static final Country _guam = new Country("_guam");
   public static final Country _guatemala = new Country("_guatemala");
   public static final Country _guernsey = new Country("_guernsey");
   public static final Country _guinea = new Country("_guinea");
   public static final Country _guineaBissau = new Country("_guineaBissau");
   public static final Country _guyana = new Country("_guyana");
   public static final Country _haiti = new Country("_haiti");
   public static final Country _heardAndMcDonaldIslands = new Country("_heardAndMcDonaldIslands");
   public static final Country _holySeeCityVaticanState = new Country("_holySeeCityVaticanState");
   public static final Country _honduras = new Country("_honduras");
   public static final Country _hongKong = new Country("_hongKong");
   public static final Country _hungary = new Country("_hungary");
   public static final Country _iceland = new Country("_iceland");
   public static final Country _india = new Country("_india");
   public static final Country _indonesia = new Country("_indonesia");
   public static final Country _iranIslamicRepublicOf = new Country("_iranIslamicRepublicOf");
   public static final Country _iraq = new Country("_iraq");
   public static final Country _ireland = new Country("_ireland");
   public static final Country _isleOfMan = new Country("_isleOfMan");
   public static final Country _israel = new Country("_israel");
   public static final Country _italy = new Country("_italy");
   public static final Country _jamaica = new Country("_jamaica");
   public static final Country _japan = new Country("_japan");
   public static final Country _jersey = new Country("_jersey");
   public static final Country _jordan = new Country("_jordan");
   public static final Country _kazakhstan = new Country("_kazakhstan");
   public static final Country _kenya = new Country("_kenya");
   public static final Country _kiribati = new Country("_kiribati");
   public static final Country _koreaDemocraticPeoplesRepublic = new Country("_koreaDemocraticPeoplesRepublic");
   public static final Country _koreaRepublicOf = new Country("_koreaRepublicOf");
   public static final Country _kosovo = new Country("_kosovo");
   public static final Country _kuwait = new Country("_kuwait");
   public static final Country _kyrgyzstan = new Country("_kyrgyzstan");
   public static final Country _laoPeoplesDemocraticRepublic = new Country("_laoPeoplesDemocraticRepublic");
   public static final Country _latvia = new Country("_latvia");
   public static final Country _lebanon = new Country("_lebanon");
   public static final Country _lesotho = new Country("_lesotho");
   public static final Country _liberia = new Country("_liberia");
   public static final Country _libya = new Country("_libya");
   public static final Country _liechtenstein = new Country("_liechtenstein");
   public static final Country _lithuania = new Country("_lithuania");
   public static final Country _luxembourg = new Country("_luxembourg");
   public static final Country _macau = new Country("_macau");
   public static final Country _macedonia = new Country("_macedonia");
   public static final Country _madagascar = new Country("_madagascar");
   public static final Country _malawi = new Country("_malawi");
   public static final Country _malaysia = new Country("_malaysia");
   public static final Country _maldives = new Country("_maldives");
   public static final Country _mali = new Country("_mali");
   public static final Country _malta = new Country("_malta");
   public static final Country _marshallIslands = new Country("_marshallIslands");
   public static final Country _martinique = new Country("_martinique");
   public static final Country _mauritania = new Country("_mauritania");
   public static final Country _mauritius = new Country("_mauritius");
   public static final Country _mayotte = new Country("_mayotte");
   public static final Country _mexico = new Country("_mexico");
   public static final Country _micronesiaFederalStateOf = new Country("_micronesiaFederalStateOf");
   public static final Country _moldovaRepublicOf = new Country("_moldovaRepublicOf");
   public static final Country _monaco = new Country("_monaco");
   public static final Country _mongolia = new Country("_mongolia");
   public static final Country _montenegro = new Country("_montenegro");
   public static final Country _montserrat = new Country("_montserrat");
   public static final Country _morocco = new Country("_morocco");
   public static final Country _mozambique = new Country("_mozambique");
   public static final Country _myanmar = new Country("_myanmar");
   public static final Country _namibia = new Country("_namibia");
   public static final Country _nauru = new Country("_nauru");
   public static final Country _nepal = new Country("_nepal");
   public static final Country _netherlands = new Country("_netherlands");
   public static final Country _newCaledonia = new Country("_newCaledonia");
   public static final Country _newZealand = new Country("_newZealand");
   public static final Country _nicaragua = new Country("_nicaragua");
   public static final Country _niger = new Country("_niger");
   public static final Country _nigeria = new Country("_nigeria");
   public static final Country _niue = new Country("_niue");
   public static final Country _norfolkIsland = new Country("_norfolkIsland");
   public static final Country _northernMarianaIslands = new Country("_northernMarianaIslands");
   public static final Country _norway = new Country("_norway");
   public static final Country _oman = new Country("_oman");
   public static final Country _pakistan = new Country("_pakistan");
   public static final Country _palau = new Country("_palau");
   public static final Country _panama = new Country("_panama");
   public static final Country _papuaNewGuinea = new Country("_papuaNewGuinea");
   public static final Country _paraguay = new Country("_paraguay");
   public static final Country _peru = new Country("_peru");
   public static final Country _philippines = new Country("_philippines");
   public static final Country _pitcairnIsland = new Country("_pitcairnIsland");
   public static final Country _poland = new Country("_poland");
   public static final Country _portugal = new Country("_portugal");
   public static final Country _puertoRico = new Country("_puertoRico");
   public static final Country _qatar = new Country("_qatar");
   public static final Country _reunionIsland = new Country("_reunionIsland");
   public static final Country _romania = new Country("_romania");
   public static final Country _russianFederation = new Country("_russianFederation");
   public static final Country _rwanda = new Country("_rwanda");
   public static final Country _saintBarthelemy = new Country("_saintBarthelemy");
   public static final Country _saintHelena = new Country("_saintHelena");
   public static final Country _saintKittsAndNevis = new Country("_saintKittsAndNevis");
   public static final Country _saintLucia = new Country("_saintLucia");
   public static final Country _saintMartin = new Country("_saintMartin");
   public static final Country _saintVincentAndTheGrenadines = new Country("_saintVincentAndTheGrenadines");
   public static final Country _samoa = new Country("_samoa");
   public static final Country _sanMarino = new Country("_sanMarino");
   public static final Country _saoTomeAndPrincipe = new Country("_saoTomeAndPrincipe");
   public static final Country _saudiArabia = new Country("_saudiArabia");
   public static final Country _senegal = new Country("_senegal");
   public static final Country _serbia = new Country("_serbia");
   public static final Country _seychelles = new Country("_seychelles");
   public static final Country _sierraLeone = new Country("_sierraLeone");
   public static final Country _singapore = new Country("_singapore");
   public static final Country _sintMaarten = new Country("_sintMaarten");
   public static final Country _slovakRepublic = new Country("_slovakRepublic");
   public static final Country _slovenia = new Country("_slovenia");
   public static final Country _solomonIslands = new Country("_solomonIslands");
   public static final Country _somalia = new Country("_somalia");
   public static final Country _southAfrica = new Country("_southAfrica");
   public static final Country _southGeorgia = new Country("_southGeorgia");
   public static final Country _southSudan = new Country("_southSudan");
   public static final Country _spain = new Country("_spain");
   public static final Country _sriLanka = new Country("_sriLanka");
   public static final Country _stateOfPalestine = new Country("_stateOfPalestine");
   public static final Country _stPierreAndMiquelon = new Country("_stPierreAndMiquelon");
   public static final Country _sudan = new Country("_sudan");
   public static final Country _suriname = new Country("_suriname");
   public static final Country _svalbardAndJanMayenIslands = new Country("_svalbardAndJanMayenIslands");
   public static final Country _swaziland = new Country("_swaziland");
   public static final Country _sweden = new Country("_sweden");
   public static final Country _switzerland = new Country("_switzerland");
   public static final Country _syrianArabRepublic = new Country("_syrianArabRepublic");
   public static final Country _taiwan = new Country("_taiwan");
   public static final Country _tajikistan = new Country("_tajikistan");
   public static final Country _tanzania = new Country("_tanzania");
   public static final Country _thailand = new Country("_thailand");
   public static final Country _togo = new Country("_togo");
   public static final Country _tokelau = new Country("_tokelau");
   public static final Country _tonga = new Country("_tonga");
   public static final Country _trinidadAndTobago = new Country("_trinidadAndTobago");
   public static final Country _tunisia = new Country("_tunisia");
   public static final Country _turkey = new Country("_turkey");
   public static final Country _turkmenistan = new Country("_turkmenistan");
   public static final Country _turksAndCaicosIslands = new Country("_turksAndCaicosIslands");
   public static final Country _tuvalu = new Country("_tuvalu");
   public static final Country _uganda = new Country("_uganda");
   public static final Country _ukraine = new Country("_ukraine");
   public static final Country _unitedArabEmirates = new Country("_unitedArabEmirates");
   public static final Country _unitedKingdom = new Country("_unitedKingdom");
   public static final Country _unitedStates = new Country("_unitedStates");
   public static final Country _uruguay = new Country("_uruguay");
   public static final Country _uSMinorOutlyingIslands = new Country("_uSMinorOutlyingIslands");
   public static final Country _uzbekistan = new Country("_uzbekistan");
   public static final Country _vanuatu = new Country("_vanuatu");
   public static final Country _venezuela = new Country("_venezuela");
   public static final Country _vietnam = new Country("_vietnam");
   public static final Country _virginIslandsBritish = new Country("_virginIslandsBritish");
   public static final Country _virginIslandsUSA = new Country("_virginIslandsUSA");
   public static final Country _wallisAndFutunaIslands = new Country("_wallisAndFutunaIslands");
   public static final Country _westernSahara = new Country("_westernSahara");
   public static final Country _yemen = new Country("_yemen");
   public static final Country _zambia = new Country("_zambia");
   public static final Country _zimbabwe = new Country("_zimbabwe");
   private static TypeDesc typeDesc = new TypeDesc(Country.class);

   protected Country(String value) {
      super();
      this._value_ = value;
      _table_.put(this._value_, this);
   }

   public String getValue() {
      return this._value_;
   }

   public static Country fromValue(String value) throws IllegalArgumentException {
      Country enumeration = (Country)_table_.get(value);
      if (enumeration == null) {
         throw new IllegalArgumentException();
      } else {
         return enumeration;
      }
   }

   public static Country fromString(String value) throws IllegalArgumentException {
      return fromValue(value);
   }

   public boolean equals(Object obj) {
      return obj == this;
   }

   public int hashCode() {
      return this.toString().hashCode();
   }

   public String toString() {
      return this._value_;
   }

   public Object readResolve() throws ObjectStreamException {
      return fromValue(this._value_);
   }

   public static Serializer getSerializer(String mechType, Class _javaType, QName _xmlType) {
      return new EnumSerializer(_javaType, _xmlType);
   }

   public static Deserializer getDeserializer(String mechType, Class _javaType, QName _xmlType) {
      return new EnumDeserializer(_javaType, _xmlType);
   }

   public static TypeDesc getTypeDesc() {
      return typeDesc;
   }

   static {
      typeDesc.setXmlType(new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "Country"));
   }
}
