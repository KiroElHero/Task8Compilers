package csen1002.main.task8.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task8.CfgLl1Parser;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task8TestsBatch6 {

	@Test
	public void testCfg1String1() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;F;A;I;G#c;g;h;k;q;z#S/cSI,k;F/q,g,e;A/hFz,zIIk,e;I/hGc,qFhI;G/cAkF,hIq#S/c,k;F/q,g,e;A/h,z,e;I/h,q;G/c,h#S/$hq;F/chz;A/k;I/$hq;G/c");
		assertEquals("S;cSI;ccSII;cccSIII;ccccSIIII;cccckIIII;cccckqFhIIII;ERROR", cfgLl1Parser.parse("cccckqkg"));
	}

	@Test
	public void testCfg1String2() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;F;A;I;G#c;g;h;k;q;z#S/cSI,k;F/q,g,e;A/hFz,zIIk,e;I/hGc,qFhI;G/cAkF,hIq#S/c,k;F/q,g,e;A/h,z,e;I/h,q;G/c,h#S/$hq;F/chz;A/k;I/$hq;G/c");
		assertEquals("S;cSI;ckI;ckhGc;ckhcAkFc;ckhchFzkFc;ckhchqzkFc;ckhchqzkqc", cfgLl1Parser.parse("ckhchqzkqc"));
	}

	@Test
	public void testCfg1String3() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;F;A;I;G#c;g;h;k;q;z#S/cSI,k;F/q,g,e;A/hFz,zIIk,e;I/hGc,qFhI;G/cAkF,hIq#S/c,k;F/q,g,e;A/h,z,e;I/h,q;G/c,h#S/$hq;F/chz;A/k;I/$hq;G/c");
		assertEquals("S;cSI;ckI;ckhGc;ckhhIqc;ckhhhGcqc;ckhhhcAkFcqc;ckhhhckFcqc;ckhhhckqcqc", cfgLl1Parser.parse("ckhhhckqcqc"));
	}

	@Test
	public void testCfg1String4() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;F;A;I;G#c;g;h;k;q;z#S/cSI,k;F/q,g,e;A/hFz,zIIk,e;I/hGc,qFhI;G/cAkF,hIq#S/c,k;F/q,g,e;A/h,z,e;I/h,q;G/c,h#S/$hq;F/chz;A/k;I/$hq;G/c");
		assertEquals("S;cSI;ccSII;cccSIII;ccckIII;ccckhGcII;ccckhcAkFcII;ccckhczIIkkFcII;ERROR", cfgLl1Parser.parse("ccckhczz"));
	}

	@Test
	public void testCfg1String5() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;F;A;I;G#c;g;h;k;q;z#S/cSI,k;F/q,g,e;A/hFz,zIIk,e;I/hGc,qFhI;G/cAkF,hIq#S/c,k;F/q,g,e;A/h,z,e;I/h,q;G/c,h#S/$hq;F/chz;A/k;I/$hq;G/c");
		assertEquals("S;cSI;ckI;ckhGc;ckhcAkFc;ckhchFzkFc;ckhchzkFc;ERROR", cfgLl1Parser.parse("ckhchzcz"));
	}

	@Test
	public void testCfg2String1() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;G;X;R;C#h;l;o;s;t;z#S/XsCz,lC;G/s,l,e;X/zSt,h,e;R/o,sG,e;C/oS,zXtR#S/hsz,l;G/s,l,e;X/z,h,e;R/o,s,e;C/o,z#S/$tz;G/$tz;X/st;R/$tz;C/$tz");
		assertEquals("S;XsCz;sCz;soSz;solCz;soloSz;sololCz;sololoSz;sololoXsCzz;sololosCzz;sololoszXtRzz;sololosztRzz;sololosztzz", cfgLl1Parser.parse("sololosztzz"));
	}

	@Test
	public void testCfg2String2() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;G;X;R;C#h;l;o;s;t;z#S/XsCz,lC;G/s,l,e;X/zSt,h,e;R/o,sG,e;C/oS,zXtR#S/hsz,l;G/s,l,e;X/z,h,e;R/o,s,e;C/o,z#S/$tz;G/$tz;X/st;R/$tz;C/$tz");
		assertEquals("S;XsCz;zStsCz;zXsCztsCz;zzStsCztsCz;zzXsCztsCztsCz;zzsCztsCztsCz;ERROR", cfgLl1Parser.parse("zzssottl"));
	}

	@Test
	public void testCfg2String3() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;G;X;R;C#h;l;o;s;t;z#S/XsCz,lC;G/s,l,e;X/zSt,h,e;R/o,sG,e;C/oS,zXtR#S/hsz,l;G/s,l,e;X/z,h,e;R/o,s,e;C/o,z#S/$tz;G/$tz;X/st;R/$tz;C/$tz");
		assertEquals("S;XsCz;sCz;soSz;soXsCzz;sosCzz;sosoSzz;sosoXsCzzz;sososCzzz;sososzXtRzzz;ERROR", cfgLl1Parser.parse("sososzoh"));
	}

	@Test
	public void testCfg2String4() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;G;X;R;C#h;l;o;s;t;z#S/XsCz,lC;G/s,l,e;X/zSt,h,e;R/o,sG,e;C/oS,zXtR#S/hsz,l;G/s,l,e;X/z,h,e;R/o,s,e;C/o,z#S/$tz;G/$tz;X/st;R/$tz;C/$tz");
		assertEquals("S;XsCz;sCz;soSz;solCz;soloSz;sololCz;sololzXtRz;sololztRz;sololztsGz;sololztssz", cfgLl1Parser.parse("sololztssz"));
	}

	@Test
	public void testCfg2String5() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;G;X;R;C#h;l;o;s;t;z#S/XsCz,lC;G/s,l,e;X/zSt,h,e;R/o,sG,e;C/oS,zXtR#S/hsz,l;G/s,l,e;X/z,h,e;R/o,s,e;C/o,z#S/$tz;G/$tz;X/st;R/$tz;C/$tz");
		assertEquals("S;XsCz;zStsCz;zXsCztsCz;zzStsCztsCz;zzXsCztsCztsCz;zzsCztsCztsCz;zzsoSztsCztsCz;zzsoXsCzztsCztsCz;zzsohsCzztsCztsCz;ERROR", cfgLl1Parser.parse("zzsohztl"));
	}

}