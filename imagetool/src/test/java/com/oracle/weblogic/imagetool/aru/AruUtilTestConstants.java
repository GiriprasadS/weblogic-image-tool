// Copyright (c) 2020, 2021, Oracle and/or its affiliates.
// Licensed under the Universal Permissive License v 1.0 as shown at https://oss.oracle.com/licenses/upl.

package com.oracle.weblogic.imagetool.aru;

import com.oracle.weblogic.imagetool.util.HttpUtil;
import org.apache.http.client.ClientProtocolException;
import org.w3c.dom.Document;

class AruUtilTestConstants {

    static final String ReleaseNumber = "600000000073715";
    static final String Version = "12.2.1.3.0";
    private static final String ReleasesResponse = "<results md5_sum=\"fb1f6fad18d72f19f671a05497811626\">\n"
        + "  <generated_date in_epoch_ms=\"1588940156000\">2020-05-08 12:15:56</generated_date>\n"
        + "  <release id=\"600000000016840602\" name=\"12.1.3.0.6\"><![CDATA[Oracle WebLogic Server 12.1.3.0"
        + ".6]]></release> \n"
        + "  <release id=\"600000000016840502\" name=\"12.1.3.0.5\"><![CDATA[Oracle WebLogic Server 12.1.3.0"
        + ".5]]></release> \n"
        + "  <release id=\"600000000016840402\" name=\"12.1.3.0.4\"><![CDATA[Oracle WebLogic Server 12.1.3.0"
        + ".4]]></release> \n"
        + "  <release id=\"600000000016840302\" name=\"12.1.3.0.3\"><![CDATA[Oracle WebLogic Server 12.1.3.0"
        + ".3]]></release> \n"
        + "  <release id=\"600000000016840202\" name=\"12.1.3.0.2\"><![CDATA[Oracle WebLogic Server 12.1.3.0"
        + ".2]]></release> \n"
        + "  <release id=\"600000000016840102\" name=\"12.1.3.0.1\"><![CDATA[Oracle WebLogic Server 12.1.3.0"
        + ".1]]></release> \n"
        + "  <release id=\"600000000123696\" name=\"14.1.1.0.0\"><![CDATA[Oracle WebLogic Server 14.1.1.0"
        + ".0]]></release> \n"
        + "  <release id=\"600000000098910\" name=\"12.2.1.4.0\"><![CDATA[Oracle WebLogic Server 12.2.1.4"
        + ".0]]></release> \n"
        + "  <release id=\"600000000073715\" name=\"12.2.1.3.0\"><![CDATA[Oracle WebLogic Server 12.2.1.3"
        + ".0]]></release> \n"
        + "  <release id=\"600000000063633\" name=\"12.2.1.2.0\"><![CDATA[Oracle WebLogic Server 12.2.1.2"
        + ".0]]></release> \n"
        + "  <release id=\"600000000055130\" name=\"12.2.1.1.0\"><![CDATA[Oracle WebLogic Server 12.2.1.1"
        + ".0]]></release> \n"
        + "  <release id=\"600000000050649\" name=\"12.2.3.0.0\"><![CDATA[Oracle WebLogic Server 12.2.3.0"
        + ".0]]></release> \n"
        + "  <release id=\"600000000050648\" name=\"12.2.2.2.0\"><![CDATA[Oracle WebLogic Server 12.2.2.2"
        + ".0]]></release> \n"
        + "  <release id=\"600000000050634\" name=\"12.2.2.1.0\"><![CDATA[Oracle WebLogic Server 12.2.2.1"
        + ".0]]></release> \n"
        + "  <release id=\"600000000046898\" name=\"12.2.2.0.0\"><![CDATA[Oracle WebLogic Server 12.2.2.0"
        + ".0]]></release> \n"
        + "  <release id=\"600000000018890\" name=\"12.2.1.0.0\"><![CDATA[Oracle WebLogic Server 12.2.1.0"
        + ".0]]></release> \n"
        + "  <release id=\"600000000016842\" name=\"12.1.3.0.0\"><![CDATA[Oracle WebLogic Server 12.1.3.0"
        + ".0]]></release> \n"
        + "  <release id=\"600000000012500\" name=\"12.1.3.0.0\"><![CDATA[Oracle WebLogic Server Plug-in 12.1.3.0"
        + ".0]]></release> \n"
        + "</results>";

    private static final String PatchesResponse = "<results md5_sum=\"bcdbb63a4ea6a5d9e461448a76dbdcb6\">\n"
        + "  <generated_date in_epoch_ms=\"1588794052000\">2020-05-06 19:40:52</generated_date>\n"
        + "  <patch has_prereqs=\"n\" has_postreqs=\"n\" is_system_patch=\"n\"> \n"
        + "    <bug> \n"
        + "      <number>30965714</number>\n"
        + "      <abstract><![CDATA[WLS PATCH SET UPDATE 12.2.1.3.200227(ID:200227.1409)]]></abstract>\n"
        + "    </bug> \n"
        + "    <name>30965714</name>\n"
        + "    <type>Patch</type>\n"
        + "    <psu_bundle>Oracle WebLogic Server 12.2.1.3.200227</psu_bundle>\n"
        + "    <status>Available</status>\n"
        + "    <access id=\"m\">Open access</access> \n"
        + "    <url> \n"
        + "      <patch_readme host=\"https://updates.oracle"
        + ".com\"><![CDATA[/Orion/Services/download?type=readme&aru=23416257]]></patch_readme> \n"
        + "      <patch_details><![CDATA[/download/30965714.html]]></patch_details>\n"
        + "    </url> \n"
        + "    <request_id>23416257</request_id>\n"
        + "    <product id=\"15991\" bugdb_id=\"5242\"><![CDATA[Oracle WebLogic Server]]></product> \n"
        + "    <release id=\"600000000073715\" name=\"12.2.1.3.0\" platform_patch_not_required=\"Y\" "
        + "cc=\"Y\"><![CDATA[Oracle WebLogic Server 12.2.1.3.0]]></release> \n"
        + "    <platform id=\"2000\" bugdb_id=\"289\"><![CDATA[Generic Platform]]></platform> \n"
        + "    <language id=\"0\" iso_code=\"EN\"><![CDATA[American English]]></language> \n"
        + "    <translations_available>No</translations_available> \n"
        + "    <classification id=\"185\">Security</classification> \n"
        + "    <patch_classification id=\"185\">Security</patch_classification> \n"
        + "    <life_cycle id=\"175\">Recommended</life_cycle> \n"
        + "    <support_level id=\"G\">General Support</support_level> \n"
        + "    <entitlements> \n"
        + "      <entitlement code=\"SW\"/> \n"
        + "    </entitlements> \n"
        + "    <fixes_bugs truncated=\"yes\"> \n"
        + "      <bug> \n"
        + "        <number>10206721</number>\n"
        + "        <abstract><![CDATA[MISSING USERNAME IN EXTENDED HTTP LOGS]]></abstract>\n"
        + "      </bug> \n"
        + "      <bug> \n"
        + "        <number>23076695</number>\n"
        + "        <abstract><![CDATA[ENSURE USE OF FACTORY METHODS WHEN INSTANTIATING XMLINPUTFACTORY]]></abstract>\n"
        + "      </bug> \n"
        + "      <bug> \n"
        + "        <number>23103220</number>\n"
        + "        <abstract><![CDATA[Fix for Bug 23103220]]></abstract>\n"
        + "      </bug> \n"
        + "      <bug> \n"
        + "        <number>24931180</number>\n"
        + "        <abstract><![CDATA[Fix for Bug 24931180]]></abstract>\n"
        + "      </bug> \n"
        + "      <bug> \n"
        + "        <number>25294832</number>\n"
        + "        <abstract><![CDATA[WLS 12.2.1.2 DEPLOYMENT ERRORSMETHOD _JSPSERVICE EXCEEDS 65535 BYTES "
        + "LIMIT]]></abstract>\n"
        + "      </bug> \n"
        + "      <bug> \n"
        + "        <number>25369207</number>\n"
        + "        <abstract><![CDATA[JAVA.LANG.OUTOFMEMORY ERROR HAPPENS WHEN INITIALIZING AN "
        + "APPLICATION]]></abstract>\n"
        + "      </bug> \n"
        + "      <bug> \n"
        + "        <number>25387569</number>\n"
        + "        <abstract><![CDATA[STRESS-OSB- ConcurrentModificationException-transaction failed during "
        + "testing]]></abstract>\n"
        + "      </bug> \n"
        + "      <bug> \n"
        + "        <number>25488428</number>\n"
        + "        <abstract><![CDATA[FIXED ADDITION OF WSS USERNAME TOKEN SECURITY HEADER TO JAXWS DISPATCH CLIENT "
        + "WITH CUSTOM POLICY ID]]></abstract>\n"
        + "      </bug> \n"
        + "      <bug> \n"
        + "        <number>25580220</number>\n"
        + "        <abstract><![CDATA[FIXED AN ISSUE THAT PREVENTED TARGETING MULTIDATASOURCE TO A PERSISTENT STORE"
        + ".]]></abstract>\n"
        + "      </bug> \n"
        + "      <bug> \n"
        + "        <number>25665727</number>\n"
        + "        <abstract><![CDATA[FIXED AN ISSUE WHERE THE ADMIN SERVER WAS CONSUMING AN INORDINATE AMOUNT OF "
        + "NATIVE MEMORY]]></abstract>\n"
        + "      </bug> \n"
        + "    </fixes_bugs> \n"
        + "    <size>60098522</size>\n"
        + "    <files> \n"
        + "      <file> \n"
        + "        <name>p30965714_122130_Generic.zip</name>\n"
        + "        <size>60098522</size>\n"
        + "        <download_url host=\"https://updates.oracle"
        + ".com\"><![CDATA[/Orion/Services/download/p30965714_122130_Generic"
        + ".zip?aru=23416257&patch_file=p30965714_122130_Generic.zip]]></download_url> \n"
        + "        <digest type=\"SHA-1\">8F300FC35E28F8E93E14C23524733E40FB832A2C</digest> \n"
        + "        <digest type=\"SHA-256\">F4BBCAFEDD272E136D613F516174FE47B3FDDA663144B1C102A85903608FD826</digest>"
        + " \n"
        + "      </file> \n"
        + "    </files> \n"
        + "    <updated_date in_epoch_ms=\"1586856568000\">2020-04-14 09:29:28</updated_date> \n"
        + "    <released_date in_epoch_ms=\"1586856567000\">2020-04-14 09:29:27</released_date> \n"
        + "  </patch> \n"
        + "  <patch has_prereqs=\"n\" has_postreqs=\"n\" is_system_patch=\"n\"> \n"
        + "    <bug> \n"
        + "      <number>28512225</number>\n"
        + "      <abstract><![CDATA[TRACKING BUG FOR LATEST XMLBEANS 28341456 - 20180816 ON WLS 12C]]></abstract>\n"
        + "    </bug> \n"
        + "    <name>28512225</name>\n"
        + "    <type>Patch</type>\n"
        + "    <status>Available</status>\n"
        + "    <access id=\"m\">Open access</access> \n"
        + "    <url> \n"
        + "      <patch_readme host=\"https://updates.oracle"
        + ".com\"><![CDATA[/Orion/Services/download?type=readme&aru=22549078]]></patch_readme> \n"
        + "      <patch_details><![CDATA[/download/28512225.html]]></patch_details>\n"
        + "    </url> \n"
        + "    <request_id>22549078</request_id>\n"
        + "    <product id=\"15991\" bugdb_id=\"5242\"><![CDATA[Oracle WebLogic Server]]></product> \n"
        + "    <release id=\"600000000073715\" name=\"12.2.1.3.0\" platform_patch_not_required=\"Y\" "
        + "cc=\"Y\"><![CDATA[Oracle WebLogic Server 12.2.1.3.0]]></release> \n"
        + "    <platform id=\"2000\" bugdb_id=\"289\"><![CDATA[Generic Platform]]></platform> \n"
        + "    <language id=\"0\" iso_code=\"EN\"><![CDATA[American English]]></language> \n"
        + "    <translations_available>No</translations_available> \n"
        + "    <classification id=\"175\">Recommended</classification> \n"
        + "    <patch_classification id=\"174\">General</patch_classification> \n"
        + "    <life_cycle id=\"175\">Recommended</life_cycle> \n"
        + "    <support_level id=\"G\">General Support</support_level> \n"
        + "    <entitlements> \n"
        + "      <entitlement code=\"SW\"/> \n"
        + "    </entitlements> \n"
        + "    <fixes_bugs truncated=\"no\"> \n"
        + "      <bug> \n"
        + "        <number>28512225</number>\n"
        + "        <abstract><![CDATA[TRACKING BUG FOR LATEST XMLBEANS 28341456 - 20180816 ON WLS 12C]]></abstract>\n"
        + "      </bug> \n"
        + "    </fixes_bugs> \n"
        + "    <size>5009408</size>\n"
        + "    <files> \n"
        + "      <file> \n"
        + "        <name>p28512225_122130_Generic.zip</name>\n"
        + "        <size>5009408</size>\n"
        + "        <download_url host=\"https://updates.oracle"
        + ".com\"><![CDATA[/Orion/Services/download/p28512225_122130_Generic"
        + ".zip?aru=22549078&patch_file=p28512225_122130_Generic.zip]]></download_url> \n"
        + "        <digest type=\"SHA-256\">314BD65BFF369EAC089C67A978D823407EDA7F44225AD3C42A1DE1DEA1DE53F9</digest>"
        + " \n"
        + "        <digest type=\"SHA-1\">2E3AC078839EE1B1C326D3F1BF01C1A802EA6BE5</digest> \n"
        + "      </file> \n"
        + "    </files> \n"
        + "    <updated_date in_epoch_ms=\"1543337691000\">2018-11-27 16:54:51</updated_date> \n"
        + "    <released_date in_epoch_ms=\"1541287184000\">2018-11-03 23:19:44</released_date> \n"
        + "  </patch> \n"
        + "  <patch has_prereqs=\"n\" has_postreqs=\"n\" is_system_patch=\"n\"> \n"
        + "    <bug> \n"
        + "      <number>28278427</number>\n"
        + "      <abstract><![CDATA[VERSION ADDED TWICE WHEN SAVING A SECURITY POLICY]]></abstract>\n"
        + "    </bug> \n"
        + "    <name>28278427</name>\n"
        + "    <type>Patch</type>\n"
        + "    <status>Available</status>\n"
        + "    <access id=\"m\">Open access</access> \n"
        + "    <url> \n"
        + "      <patch_readme host=\"https://updates.oracle"
        + ".com\"><![CDATA[/Orion/Services/download?type=readme&aru=22374151]]></patch_readme> \n"
        + "      <patch_details><![CDATA[/download/28278427.html]]></patch_details>\n"
        + "    </url> \n"
        + "    <request_id>22374151</request_id>\n"
        + "    <product id=\"15991\" bugdb_id=\"5242\"><![CDATA[Oracle WebLogic Server]]></product> \n"
        + "    <release id=\"600000000073715\" name=\"12.2.1.3.0\" platform_patch_not_required=\"Y\" "
        + "cc=\"Y\"><![CDATA[Oracle WebLogic Server 12.2.1.3.0]]></release> \n"
        + "    <platform id=\"2000\" bugdb_id=\"289\"><![CDATA[Generic Platform]]></platform> \n"
        + "    <language id=\"0\" iso_code=\"EN\"><![CDATA[American English]]></language> \n"
        + "    <translations_available>No</translations_available> \n"
        + "    <classification id=\"175\">Recommended</classification> \n"
        + "    <patch_classification id=\"174\">General</patch_classification> \n"
        + "    <life_cycle id=\"175\">Recommended</life_cycle> \n"
        + "    <support_level id=\"G\">General Support</support_level> \n"
        + "    <entitlements> \n"
        + "      <entitlement code=\"SW\"/> \n"
        + "    </entitlements> \n"
        + "    <fixes_bugs truncated=\"no\"> \n"
        + "      <bug> \n"
        + "        <number>28278427</number>\n"
        + "        <abstract><![CDATA[VERSION ADDED TWICE WHEN SAVING A SECURITY POLICY]]></abstract>\n"
        + "      </bug> \n"
        + "    </fixes_bugs> \n"
        + "    <size>109129</size>\n"
        + "    <files> \n"
        + "      <file> \n"
        + "        <name>p28278427_122130_Generic.zip</name>\n"
        + "        <size>109129</size>\n"
        + "        <download_url host=\"https://updates.oracle"
        + ".com\"><![CDATA[/Orion/Services/download/p28278427_122130_Generic"
        + ".zip?aru=22374151&patch_file=p28278427_122130_Generic.zip]]></download_url> \n"
        + "        <digest type=\"SHA-1\">AFF13A8D13714673C673EB66D054EEB02F4E0EBE</digest> \n"
        + "        <digest type=\"SHA-256\">FAD95E4B0622B30EA425EFCFBA123ABFCE7865401ABD1A7A4B34BAA429BB3CF0</digest>"
        + " \n"
        + "      </file> \n"
        + "    </files> \n"
        + "    <updated_date in_epoch_ms=\"1533565968000\">2018-08-06 14:32:48</updated_date> \n"
        + "    <released_date in_epoch_ms=\"1533565968000\">2018-08-06 14:32:48</released_date> \n"
        + "  </patch> \n"
        + "</results>";

    private static final String PSUResponse = "<results md5_sum=\"f80f80746786dbc4b3468f38cee56bd8\">\n"
        + "  <generated_date in_epoch_ms=\"1589201553000\">2020-05-11 12:52:33</generated_date>\n"
        + "  <patch has_prereqs=\"n\" has_postreqs=\"n\" is_system_patch=\"n\"> \n"
        + "    <bug> \n"
        + "      <number>30965714</number>\n"
        + "      <abstract><![CDATA[WLS PATCH SET UPDATE 12.2.1.3.200227(ID:200227.1409)]]></abstract>\n"
        + "    </bug> \n"
        + "    <name>30965714</name>\n"
        + "    <type>Patch</type>\n"
        + "    <psu_bundle>Oracle WebLogic Server 12.2.1.3.200227</psu_bundle>\n"
        + "    <status>Available</status>\n"
        + "    <access id=\"m\">Open access</access> \n"
        + "    <url> \n"
        + "      <patch_readme host=\"https://updates.oracle"
        + ".com\"><![CDATA[/Orion/Services/download?type=readme&aru=23416257]]></patch_readme> \n"
        + "      <patch_details><![CDATA[/download/30965714.html]]></patch_details>\n"
        + "    </url> \n"
        + "    <request_id>23416257</request_id>\n"
        + "    <product id=\"15991\" bugdb_id=\"5242\"><![CDATA[Oracle WebLogic Server]]></product> \n"
        + "    <release id=\"600000000073715\" name=\"12.2.1.3.0\" platform_patch_not_required=\"Y\" "
        + "cc=\"Y\"><![CDATA[Oracle WebLogic Server 12.2.1.3.0]]></release> \n"
        + "    <platform id=\"2000\" bugdb_id=\"289\"><![CDATA[Generic Platform]]></platform> \n"
        + "    <language id=\"0\" iso_code=\"EN\"><![CDATA[American English]]></language> \n"
        + "    <translations_available>No</translations_available> \n"
        + "    <classification id=\"185\">Security</classification> \n"
        + "    <patch_classification id=\"185\">Security</patch_classification> \n"
        + "    <life_cycle id=\"175\">Recommended</life_cycle> \n"
        + "    <support_level id=\"G\">General Support</support_level> \n"
        + "    <entitlements> \n"
        + "      <entitlement code=\"SW\"/> \n"
        + "    </entitlements> \n"
        + "    <fixes_bugs truncated=\"yes\"> \n"
        + "      <bug> \n"
        + "        <number>10206721</number>\n"
        + "        <abstract><![CDATA[MISSING USERNAME IN EXTENDED HTTP LOGS]]></abstract>\n"
        + "      </bug> \n"
        + "      <bug> \n"
        + "        <number>23076695</number>\n"
        + "        <abstract><![CDATA[ENSURE USE OF FACTORY METHODS WHEN INSTANTIATING XMLINPUTFACTORY]]></abstract>\n"
        + "      </bug> \n"
        + "      <bug> \n"
        + "        <number>23103220</number>\n"
        + "        <abstract><![CDATA[Fix for Bug 23103220]]></abstract>\n"
        + "      </bug> \n"
        + "      <bug> \n"
        + "        <number>24931180</number>\n"
        + "        <abstract><![CDATA[Fix for Bug 24931180]]></abstract>\n"
        + "      </bug> \n"
        + "      <bug> \n"
        + "        <number>25294832</number>\n"
        + "        <abstract><![CDATA[WLS 12.2.1.2 DEPLOYMENT ERRORSMETHOD _JSPSERVICE EXCEEDS 65535 BYTES "
        + "LIMIT]]></abstract>\n"
        + "      </bug> \n"
        + "      <bug> \n"
        + "        <number>25369207</number>\n"
        + "        <abstract><![CDATA[JAVA.LANG.OUTOFMEMORY ERROR HAPPENS WHEN INITIALIZING AN "
        + "APPLICATION]]></abstract>\n"
        + "      </bug> \n"
        + "      <bug> \n"
        + "        <number>25387569</number>\n"
        + "        <abstract><![CDATA[STRESS-OSB- ConcurrentModificationException-transaction failed during "
        + "testing]]></abstract>\n"
        + "      </bug> \n"
        + "      <bug> \n"
        + "        <number>25488428</number>\n"
        + "        <abstract><![CDATA[FIXED ADDITION OF WSS USERNAME TOKEN SECURITY HEADER TO JAXWS DISPATCH CLIENT "
        + "WITH CUSTOM POLICY ID]]></abstract>\n"
        + "      </bug> \n"
        + "      <bug> \n"
        + "        <number>25580220</number>\n"
        + "        <abstract><![CDATA[FIXED AN ISSUE THAT PREVENTED TARGETING MULTIDATASOURCE TO A PERSISTENT STORE"
        + ".]]></abstract>\n"
        + "      </bug> \n"
        + "      <bug> \n"
        + "        <number>25665727</number>\n"
        + "        <abstract><![CDATA[FIXED AN ISSUE WHERE THE ADMIN SERVER WAS CONSUMING AN INORDINATE AMOUNT OF "
        + "NATIVE MEMORY]]></abstract>\n"
        + "      </bug> \n"
        + "    </fixes_bugs> \n"
        + "    <size>60098522</size>\n"
        + "    <files> \n"
        + "      <file> \n"
        + "        <name>p30965714_122130_Generic.zip</name>\n"
        + "        <size>60098522</size>\n"
        + "        <download_url host=\"https://updates.oracle"
        + ".com\"><![CDATA[/Orion/Services/download/p30965714_122130_Generic"
        + ".zip?aru=23416257&patch_file=p30965714_122130_Generic.zip]]></download_url> \n"
        + "        <digest type=\"SHA-256\">F4BBCAFEDD272E136D613F516174FE47B3FDDA663144B1C102A85903608FD826</digest>"
        + " \n"
        + "        <digest type=\"SHA-1\">8F300FC35E28F8E93E14C23524733E40FB832A2C</digest> \n"
        + "      </file> \n"
        + "    </files> \n"
        + "    <updated_date in_epoch_ms=\"1586856568000\">2020-04-14 09:29:28</updated_date> \n"
        + "    <released_date in_epoch_ms=\"1586856567000\">2020-04-14 09:29:27</released_date> \n"
        + "  </patch> \n"
        + "</results>";

    static final String ValidationResponse = "<conflict_check platform_id=\"2000\" >\n"
        + "  <conflict_free_list>\n"
        + "   <patch release_id=\"600000000073715\" language_id=\"0\" >\n"
        + "      <bug>\n"
        + "        <number>30965714</number>\n"
        + "        <abstract><![CDATA[WLS PATCH SET UPDATE 12.2.1.3.200227(ID:200227.1409)]]></abstract>\n"
        + "      </bug>\n"
        + "      <patch_name>30965714</patch_name>\n"
        + "    </patch>\n"
        + "  </conflict_free_list>\n"
        + "  <conflict_sets>\n"
        + "  </conflict_sets>\n"
        + "  <messages>\n"
        + "  </messages>\n"
        + "</conflict_check>";

    static Document getReleasesResponse() throws ClientProtocolException {
        return HttpUtil.parseXmlString(ReleasesResponse);
    }

    static Document getPatchesResponse() throws ClientProtocolException {
        return HttpUtil.parseXmlString(PatchesResponse);
    }

}