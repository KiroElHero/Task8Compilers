package csen1002.main.task8.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task8.CfgLl1Parser;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task8TestsBatch5 {

	@Test
	public void testCfg1String1() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;R;M;K;Y#a;f;g;m;w;z#S/gS,wR;R/a,YmS,e;M/aK,mS,fR,e;K/gY,zRzK,e;Y/g,fMw#S/g,w;R/a,fg,e;M/a,m,f,e;K/g,z,e;Y/g,f#S/$wz;R/$wz;M/w;K/w;Y/mw");
		assertEquals("S;wR;wYmS;wfMwmS;wfwmS;wfwmwR;wfwmwYmS;wfwmwgmS;wfwmwgmwR;wfwmwgmw", cfgLl1Parser.parse("wfwmwgmw"));
	}

	@Test
	public void testCfg1String2() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;R;M;K;Y#a;f;g;m;w;z#S/gS,wR;R/a,YmS,e;M/aK,mS,fR,e;K/gY,zRzK,e;Y/g,fMw#S/g,w;R/a,fg,e;M/a,m,f,e;K/g,z,e;Y/g,f#S/$wz;R/$wz;M/w;K/w;Y/mw");
		assertEquals("S;wR;wYmS;wgmS;wgmgS;wgmggS;wgmggwR;wgmggwYmS;wgmggwgmS;wgmggwgmwR;wgmggwgmw", cfgLl1Parser.parse("wgmggwgmw"));
	}

	@Test
	public void testCfg1String3() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;R;M;K;Y#a;f;g;m;w;z#S/gS,wR;R/a,YmS,e;M/aK,mS,fR,e;K/gY,zRzK,e;Y/g,fMw#S/g,w;R/a,fg,e;M/a,m,f,e;K/g,z,e;Y/g,f#S/$wz;R/$wz;M/w;K/w;Y/mw");
		assertEquals("S;gS;ggS;gggS;gggwR;gggwYmS;gggwfMwmS;gggwffRwmS;gggwffwmS;gggwffwmgS;gggwffwmgwR;gggwffwmgw", cfgLl1Parser.parse("gggwffwmgw"));
	}

	@Test
	public void testCfg1String4() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;R;M;K;Y#a;f;g;m;w;z#S/gS,wR;R/a,YmS,e;M/aK,mS,fR,e;K/gY,zRzK,e;Y/g,fMw#S/g,w;R/a,fg,e;M/a,m,f,e;K/g,z,e;Y/g,f#S/$wz;R/$wz;M/w;K/w;Y/mw");
		assertEquals("S;wR;wYmS;wfMwmS;wfmSwmS;wfmwRwmS;wfmwYmSwmS;wfmwfMwmSwmS;wfmwfwmSwmS;ERROR", cfgLl1Parser.parse("wfmwfwwa"));
	}

	@Test
	public void testCfg1String5() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;R;M;K;Y#a;f;g;m;w;z#S/gS,wR;R/a,YmS,e;M/aK,mS,fR,e;K/gY,zRzK,e;Y/g,fMw#S/g,w;R/a,fg,e;M/a,m,f,e;K/g,z,e;Y/g,f#S/$wz;R/$wz;M/w;K/w;Y/mw");
		assertEquals("S;gS;gwR;gwYmS;gwgmS;gwgmgS;gwgmggS;ERROR", cfgLl1Parser.parse("gwgmggfw"));
	}

	@Test
	public void testCfg2String1() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;Y;W;Z;B#a;b;h;j;k;o;t#S/b,Wa;Y/h,Zt;W/hB,j,e;Z/bW,jWt,e;B/jYo,kW#S/b,ahj;Y/h,bjt;W/h,j,e;Z/b,j,e;B/j,k#S/$;Y/o;W/at;Z/t;B/at");
		assertEquals("S;Wa;hBa;hjYoa;hjZtoa;hjjWttoa;hjjhBttoa;ERROR", cfgLl1Parser.parse("hjjhtta"));
	}

	@Test
	public void testCfg2String2() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;Y;W;Z;B#a;b;h;j;k;o;t#S/b,Wa;Y/h,Zt;W/hB,j,e;Z/bW,jWt,e;B/jYo,kW#S/b,ahj;Y/h,bjt;W/h,j,e;Z/b,j,e;B/j,k#S/$;Y/o;W/at;Z/t;B/at");
		assertEquals("S;Wa;hBa;hkWa;hkhBa;hkhkWa;hkhkhBa;hkhkhkWa;hkhkhkhBa;hkhkhkhjYoa;hkhkhkhjhoa", cfgLl1Parser.parse("hkhkhkhjhoa"));
	}

	@Test
	public void testCfg2String3() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;Y;W;Z;B#a;b;h;j;k;o;t#S/b,Wa;Y/h,Zt;W/hB,j,e;Z/bW,jWt,e;B/jYo,kW#S/b,ahj;Y/h,bjt;W/h,j,e;Z/b,j,e;B/j,k#S/$;Y/o;W/at;Z/t;B/at");
		assertEquals("S;Wa;hBa;hkWa;hkhBa;hkhjYoa;hkhjZtoa;hkhjbWtoa;hkhjbjtoa", cfgLl1Parser.parse("hkhjbjtoa"));
	}

	@Test
	public void testCfg2String4() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;Y;W;Z;B#a;b;h;j;k;o;t#S/b,Wa;Y/h,Zt;W/hB,j,e;Z/bW,jWt,e;B/jYo,kW#S/b,ahj;Y/h,bjt;W/h,j,e;Z/b,j,e;B/j,k#S/$;Y/o;W/at;Z/t;B/at");
		assertEquals("S;Wa;hBa;hjYoa;hjZtoa;hjjWttoa;hjjjttoa;ERROR", cfgLl1Parser.parse("hjjjjjao"));
	}

	@Test
	public void testCfg2String5() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;Y;W;Z;B#a;b;h;j;k;o;t#S/b,Wa;Y/h,Zt;W/hB,j,e;Z/bW,jWt,e;B/jYo,kW#S/b,ahj;Y/h,bjt;W/h,j,e;Z/b,j,e;B/j,k#S/$;Y/o;W/at;Z/t;B/at");
		assertEquals("S;Wa;hBa;hkWa;hkhBa;hkhjYoa;hkhjZtoa;hkhjbWtoa;hkhjbhBtoa;hkhjbhkWtoa;hkhjbhktoa", cfgLl1Parser.parse("hkhjbhktoa"));
	}

}