package csen1002.main.task8.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task8.CfgLl1Parser;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task8TestsBatch1 {

	@Test
	public void testCfg1String1() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;G;B;X;F#c;d;k;o;p;s#S/d,oF,pB,kX;G/kXF,sF;B/s,Fp,cG,e;X/c,kXsG,e;F/p,d#S/d,o,p,k;G/k,s;B/s,dp,c,e;X/c,k,e;F/p,d#S/$;G/$dps;B/$;X/$dps;F/$dps");
		assertEquals("S;kX;kkXsG;kkcsG;kkcskXF;kkcskkXsGF;kkcskksGF;kkcskkskXFF;kkcskkskcFF;kkcskkskcpF;kkcskkskcpp", cfgLl1Parser.parse("kkcskkskcpp"));
	}

	@Test
	public void testCfg1String2() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;G;B;X;F#c;d;k;o;p;s#S/d,oF,pB,kX;G/kXF,sF;B/s,Fp,cG,e;X/c,kXsG,e;F/p,d#S/d,o,p,k;G/k,s;B/s,dp,c,e;X/c,k,e;F/p,d#S/$;G/$dps;B/$;X/$dps;F/$dps");
		assertEquals("S;kX;kkXsG;kkkXsGsG;kkkkXsGsGsG;kkkkkXsGsGsGsG;kkkkkkXsGsGsGsGsG;kkkkkkkXsGsGsGsGsGsG;kkkkkkksGsGsGsGsGsG;ERROR", cfgLl1Parser.parse("kkkkkkkp"));
	}

	@Test
	public void testCfg1String3() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;G;B;X;F#c;d;k;o;p;s#S/d,oF,pB,kX;G/kXF,sF;B/s,Fp,cG,e;X/c,kXsG,e;F/p,d#S/d,o,p,k;G/k,s;B/s,dp,c,e;X/c,k,e;F/p,d#S/$;G/$dps;B/$;X/$dps;F/$dps");
		assertEquals("S;kX;kkXsG;kksG;kkskXF;kkskkXsGF;kkskksGF;kkskkssFF;kkskksspF;kkskksspp", cfgLl1Parser.parse("kkskksspp"));
	}

	@Test
	public void testCfg1String4() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;G;B;X;F#c;d;k;o;p;s#S/d,oF,pB,kX;G/kXF,sF;B/s,Fp,cG,e;X/c,kXsG,e;F/p,d#S/d,o,p,k;G/k,s;B/s,dp,c,e;X/c,k,e;F/p,d#S/$;G/$dps;B/$;X/$dps;F/$dps");
		assertEquals("S;kX;kkXsG;kkkXsGsG;kkksGsG;kkkssFsG;kkkssdsG;kkkssdssF;kkkssdssd", cfgLl1Parser.parse("kkkssdssd"));
	}

	@Test
	public void testCfg1String5() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;G;B;X;F#c;d;k;o;p;s#S/d,oF,pB,kX;G/kXF,sF;B/s,Fp,cG,e;X/c,kXsG,e;F/p,d#S/d,o,p,k;G/k,s;B/s,dp,c,e;X/c,k,e;F/p,d#S/$;G/$dps;B/$;X/$dps;F/$dps");
		assertEquals("S;pB;pcG;pckXF;pckkXsGF;pckkcsGF;pckkcssFF;pckkcsspF;pckkcsspd", cfgLl1Parser.parse("pckkcsspd"));
	}

	@Test
	public void testCfg2String1() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;H;M;U;J#g;i;k;r;v;w;x#S/iJrS,Jw;H/xMw,vHgU,e;M/gM,xSU,e;U/JgH,iJ,k,e;J/v,rSMw#S/i,rv;H/x,v,e;M/g,x,e;U/rv,i,k,e;J/v,r#S/$gikrvwx;H/gw;M/w;U/gw;J/grw");
		assertEquals("S;Jw;rSMww;rJwMww;rrSMwwMww;rrJwMwwMww;rrrSMwwMwwMww;rrriJrSMwwMwwMww;ERROR", cfgLl1Parser.parse("rrriwwrk"));
	}

	@Test
	public void testCfg2String2() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;H;M;U;J#g;i;k;r;v;w;x#S/iJrS,Jw;H/xMw,vHgU,e;M/gM,xSU,e;U/JgH,iJ,k,e;J/v,rSMw#S/i,rv;H/x,v,e;M/g,x,e;U/rv,i,k,e;J/v,r#S/$gikrvwx;H/gw;M/w;U/gw;J/grw");
		assertEquals("S;Jw;rSMww;rJwMww;rrSMwwMww;rrJwMwwMww;rrvwMwwMww;ERROR", cfgLl1Parser.parse("rrvirxrv"));
	}

	@Test
	public void testCfg2String3() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;H;M;U;J#g;i;k;r;v;w;x#S/iJrS,Jw;H/xMw,vHgU,e;M/gM,xSU,e;U/JgH,iJ,k,e;J/v,rSMw#S/i,rv;H/x,v,e;M/g,x,e;U/rv,i,k,e;J/v,r#S/$gikrvwx;H/gw;M/w;U/gw;J/grw");
		assertEquals("S;Jw;rSMww;rJwMww;rvwMww;rvwxSUww;rvwxJwUww;rvwxvwUww;rvwxvwiJww;rvwxvwivww", cfgLl1Parser.parse("rvwxvwivww"));
	}

	@Test
	public void testCfg2String4() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;H;M;U;J#g;i;k;r;v;w;x#S/iJrS,Jw;H/xMw,vHgU,e;M/gM,xSU,e;U/JgH,iJ,k,e;J/v,rSMw#S/i,rv;H/x,v,e;M/g,x,e;U/rv,i,k,e;J/v,r#S/$gikrvwx;H/gw;M/w;U/gw;J/grw");
		assertEquals("S;Jw;rSMww;rJwMww;rrSMwwMww;rrJwMwwMww;rrvwMwwMww;ERROR", cfgLl1Parser.parse("rrvkvixk"));
	}

	@Test
	public void testCfg2String5() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;H;M;U;J#g;i;k;r;v;w;x#S/iJrS,Jw;H/xMw,vHgU,e;M/gM,xSU,e;U/JgH,iJ,k,e;J/v,rSMw#S/i,rv;H/x,v,e;M/g,x,e;U/rv,i,k,e;J/v,r#S/$gikrvwx;H/gw;M/w;U/gw;J/grw");
		assertEquals("S;Jw;rSMww;rJwMww;rrSMwwMww;rrJwMwwMww;rrvwMwwMww;ERROR", cfgLl1Parser.parse("rrvgxkw"));
	}

}