package csen1002.main.task8.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task8.CfgLl1Parser;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task8TestsBatch4 {

	@Test
	public void testCfg1String1() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;Z;I;U;M#g;j;k;q;r;v;z#S/UMrU,MMS;Z/kSvM,g,e;I/k,gZr,e;U/rIj,gMz,z;M/v,qU#S/grz,qv;Z/k,g,e;I/k,g,e;U/r,g,z;M/v,q#S/$v;Z/r;I/j;U/qrvz;M/qrvz");
		assertEquals("S;MMS;vMS;vqUS;vqzS;vqzMMS;vqzvMS;vqzvqUS;vqzvqrIjS;vqzvqrjS;vqzvqrjUMrU;vqzvqrjzMrU;vqzvqrjzvrU;vqzvqrjzvrz", cfgLl1Parser.parse("vqzvqrjzvrz"));
	}

	@Test
	public void testCfg1String2() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;Z;I;U;M#g;j;k;q;r;v;z#S/UMrU,MMS;Z/kSvM,g,e;I/k,gZr,e;U/rIj,gMz,z;M/v,qU#S/grz,qv;Z/k,g,e;I/k,g,e;U/r,g,z;M/v,q#S/$v;Z/r;I/j;U/qrvz;M/qrvz");
		assertEquals("S;MMS;vMS;vvS;vvMMS;vvqUMS;vvqzMS;vvqzqUS;vvqzqgMzS;vvqzqgvzS;ERROR", cfgLl1Parser.parse("vvqzqgvr"));
	}

	@Test
	public void testCfg1String3() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;Z;I;U;M#g;j;k;q;r;v;z#S/UMrU,MMS;Z/kSvM,g,e;I/k,gZr,e;U/rIj,gMz,z;M/v,qU#S/grz,qv;Z/k,g,e;I/k,g,e;U/r,g,z;M/v,q#S/$v;Z/r;I/j;U/qrvz;M/qrvz");
		assertEquals("S;UMrU;zMrU;zqUrU;zqrIjrU;zqrgZrjrU;zqrggrjrU;ERROR", cfgLl1Parser.parse("zqrggkvj"));
	}

	@Test
	public void testCfg1String4() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;Z;I;U;M#g;j;k;q;r;v;z#S/UMrU,MMS;Z/kSvM,g,e;I/k,gZr,e;U/rIj,gMz,z;M/v,qU#S/grz,qv;Z/k,g,e;I/k,g,e;U/r,g,z;M/v,q#S/$v;Z/r;I/j;U/qrvz;M/qrvz");
		assertEquals("S;UMrU;zMrU;zvrU;zvrgMz;zvrgqUz;zvrgqgMzz;zvrgqgvzz", cfgLl1Parser.parse("zvrgqgvzz"));
	}

	@Test
	public void testCfg1String5() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;Z;I;U;M#g;j;k;q;r;v;z#S/UMrU,MMS;Z/kSvM,g,e;I/k,gZr,e;U/rIj,gMz,z;M/v,qU#S/grz,qv;Z/k,g,e;I/k,g,e;U/r,g,z;M/v,q#S/$v;Z/r;I/j;U/qrvz;M/qrvz");
		assertEquals("S;UMrU;gMzMrU;gqUzMrU;gqrIjzMrU;gqrgZrjzMrU;gqrgkSvMrjzMrU;gqrgkUMrUvMrjzMrU;gqrgkgMzMrUvMrjzMrU;ERROR", cfgLl1Parser.parse("gqrgkgzv"));
	}

	@Test
	public void testCfg2String1() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;F;J;O;X#b;c;g;l;q;s;t#S/lXqX,JqO;F/bXl,t,sFl,e;J/bJtJ,gJc,e;O/c,sFg,e;X/bO,gF#S/l,bgq;F/b,t,s,e;J/b,g,e;O/c,s,e;X/b,g#S/$;F/glq;J/cqt;O/$lq;X/lq");
		assertEquals("S;lXqX;lbOqX;lbcqX;lbcqgF;lbcqgsFl;lbcqgsbXll;ERROR", cfgLl1Parser.parse("lbcqgsbl"));
	}

	@Test
	public void testCfg2String2() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;F;J;O;X#b;c;g;l;q;s;t#S/lXqX,JqO;F/bXl,t,sFl,e;J/bJtJ,gJc,e;O/c,sFg,e;X/bO,gF#S/l,bgq;F/b,t,s,e;J/b,g,e;O/c,s,e;X/b,g#S/$;F/glq;J/cqt;O/$lq;X/lq");
		assertEquals("S;lXqX;lbOqX;lbcqX;lbcqbO;lbcqbsFg;lbcqbssFlg;lbcqbsslg", cfgLl1Parser.parse("lbcqbsslg"));
	}

	@Test
	public void testCfg2String3() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;F;J;O;X#b;c;g;l;q;s;t#S/lXqX,JqO;F/bXl,t,sFl,e;J/bJtJ,gJc,e;O/c,sFg,e;X/bO,gF#S/l,bgq;F/b,t,s,e;J/b,g,e;O/c,s,e;X/b,g#S/$;F/glq;J/cqt;O/$lq;X/lq");
		assertEquals("S;JqO;bJtJqO;bgJctJqO;bggJcctJqO;bggcctJqO;bggcctqO;bggcctq", cfgLl1Parser.parse("bggcctq"));
	}

	@Test
	public void testCfg2String4() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;F;J;O;X#b;c;g;l;q;s;t#S/lXqX,JqO;F/bXl,t,sFl,e;J/bJtJ,gJc,e;O/c,sFg,e;X/bO,gF#S/l,bgq;F/b,t,s,e;J/b,g,e;O/c,s,e;X/b,g#S/$;F/glq;J/cqt;O/$lq;X/lq");
		assertEquals("S;JqO;bJtJqO;bbJtJtJqO;bbtJtJqO;bbttJqO;bbttqO;bbttqc", cfgLl1Parser.parse("bbttqc"));
	}

	@Test
	public void testCfg2String5() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;F;J;O;X#b;c;g;l;q;s;t#S/lXqX,JqO;F/bXl,t,sFl,e;J/bJtJ,gJc,e;O/c,sFg,e;X/bO,gF#S/l,bgq;F/b,t,s,e;J/b,g,e;O/c,s,e;X/b,g#S/$;F/glq;J/cqt;O/$lq;X/lq");
		assertEquals("S;JqO;bJtJqO;btJqO;btbJtJqO;btbtJqO;btbtqO;btbtq", cfgLl1Parser.parse("btbtq"));
	}

}