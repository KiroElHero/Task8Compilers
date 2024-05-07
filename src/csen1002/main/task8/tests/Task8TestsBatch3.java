package csen1002.main.task8.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task8.CfgLl1Parser;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task8TestsBatch3 {

	@Test
	public void testCfg1String1() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;J;A;E;P#b;f;k;n;o;y#S/Jo,fAo;J/o,kSS,yJy;A/bEPE,fJJk,e;E/n,oPnE,e;P/bPn,ySEb#S/koy,f;J/o,k,y;A/b,f,e;E/n,o,e;P/b,y#S/$bfknoy;J/koy;A/o;E/by;P/no");
		assertEquals("S;Jo;yJyo;ykSSyo;ykJoSyo;ykyJyoSyo;ykykSSyoSyo;ERROR", cfgLl1Parser.parse("ykykbnob"));
	}

	@Test
	public void testCfg1String2() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;J;A;E;P#b;f;k;n;o;y#S/Jo,fAo;J/o,kSS,yJy;A/bEPE,fJJk,e;E/n,oPnE,e;P/bPn,ySEb#S/koy,f;J/o,k,y;A/b,f,e;E/n,o,e;P/b,y#S/$bfknoy;J/koy;A/o;E/by;P/no");
		assertEquals("S;fAo;fbEPEo;fbPEo;fbbPnEo;fbbySEbnEo;fbbyfAoEbnEo;fbbyfoEbnEo;fbbyfonbnEo;fbbyfonbnno", cfgLl1Parser.parse("fbbyfonbnno"));
	}

	@Test
	public void testCfg1String3() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;J;A;E;P#b;f;k;n;o;y#S/Jo,fAo;J/o,kSS,yJy;A/bEPE,fJJk,e;E/n,oPnE,e;P/bPn,ySEb#S/koy,f;J/o,k,y;A/b,f,e;E/n,o,e;P/b,y#S/$bfknoy;J/koy;A/o;E/by;P/no");
		assertEquals("S;fAo;fbEPEo;fbnPEo;fbnySEbEo;fbnyJoEbEo;fbnyooEbEo;fbnyoobEo;fbnyoobno", cfgLl1Parser.parse("fbnyoobno"));
	}

	@Test
	public void testCfg1String4() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;J;A;E;P#b;f;k;n;o;y#S/Jo,fAo;J/o,kSS,yJy;A/bEPE,fJJk,e;E/n,oPnE,e;P/bPn,ySEb#S/koy,f;J/o,k,y;A/b,f,e;E/n,o,e;P/b,y#S/$bfknoy;J/koy;A/o;E/by;P/no");
		assertEquals("S;fAo;fbEPEo;fboPnEPEo;fboySEbnEPEo;fboyJoEbnEPEo;fboyooEbnEPEo;ERROR", cfgLl1Parser.parse("fboyoyyb"));
	}

	@Test
	public void testCfg1String5() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;J;A;E;P#b;f;k;n;o;y#S/Jo,fAo;J/o,kSS,yJy;A/bEPE,fJJk,e;E/n,oPnE,e;P/bPn,ySEb#S/koy,f;J/o,k,y;A/b,f,e;E/n,o,e;P/b,y#S/$bfknoy;J/koy;A/o;E/by;P/no");
		assertEquals("S;Jo;kSSo;kJoSo;kkSSoSo;kkfAoSoSo;kkfbEPEoSoSo;kkfbPEoSoSo;kkfbySEbEoSoSo;kkfbyJoEbEoSoSo;kkfbykSSoEbEoSoSo;ERROR", cfgLl1Parser.parse("kkfbykb"));
	}

	@Test
	public void testCfg2String1() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;W;U;K;J#b;g;h;t;u;w;x#S/hUxK,x;W/tSh,wJW,e;U/hUx,g,wSbU,e;K/xWh,J,e;J/w,uJx#S/h,x;W/t,w,e;U/h,g,w,e;K/x,uw,e;J/w,u#S/$bh;W/h;U/x;K/$bh;J/$bhtwx");
		assertEquals("S;hUxK;hwSbUxK;hwhUxKbUxK;hwhxKbUxK;hwhxbUxK;hwhxbgxK;hwhxbgxJ;hwhxbgxw", cfgLl1Parser.parse("hwhxbgxw"));
	}

	@Test
	public void testCfg2String2() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;W;U;K;J#b;g;h;t;u;w;x#S/hUxK,x;W/tSh,wJW,e;U/hUx,g,wSbU,e;K/xWh,J,e;J/w,uJx#S/h,x;W/t,w,e;U/h,g,w,e;K/x,uw,e;J/w,u#S/$bh;W/h;U/x;K/$bh;J/$bhtwx");
		assertEquals("S;hUxK;hwSbUxK;hwhUxKbUxK;hwhxKbUxK;hwhxJbUxK;hwhxwbUxK;hwhxwbwSbUxK;hwhxwbwxbUxK;hwhxwbwxbxK;hwhxwbwxbx", cfgLl1Parser.parse("hwhxwbwxbx"));
	}

	@Test
	public void testCfg2String3() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;W;U;K;J#b;g;h;t;u;w;x#S/hUxK,x;W/tSh,wJW,e;U/hUx,g,wSbU,e;K/xWh,J,e;J/w,uJx#S/h,x;W/t,w,e;U/h,g,w,e;K/x,uw,e;J/w,u#S/$bh;W/h;U/x;K/$bh;J/$bhtwx");
		assertEquals("S;hUxK;hhUxxK;hhwSbUxxK;hhwhUxKbUxxK;hhwhhUxxKbUxxK;hhwhhxxKbUxxK;hhwhhxxbUxxK;hhwhhxxbxxK;hhwhhxxbxx", cfgLl1Parser.parse("hhwhhxxbxx"));
	}

	@Test
	public void testCfg2String4() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;W;U;K;J#b;g;h;t;u;w;x#S/hUxK,x;W/tSh,wJW,e;U/hUx,g,wSbU,e;K/xWh,J,e;J/w,uJx#S/h,x;W/t,w,e;U/h,g,w,e;K/x,uw,e;J/w,u#S/$bh;W/h;U/x;K/$bh;J/$bhtwx");
		assertEquals("S;hUxK;hhUxxK;hhwSbUxxK;hhwxbUxxK;hhwxbhUxxxK;hhwxbhxxxK;hhwxbhxxx", cfgLl1Parser.parse("hhwxbhxxx"));
	}

	@Test
	public void testCfg2String5() {
		CfgLl1Parser cfgLl1Parser= new CfgLl1Parser("S;W;U;K;J#b;g;h;t;u;w;x#S/hUxK,x;W/tSh,wJW,e;U/hUx,g,wSbU,e;K/xWh,J,e;J/w,uJx#S/h,x;W/t,w,e;U/h,g,w,e;K/x,uw,e;J/w,u#S/$bh;W/h;U/x;K/$bh;J/$bhtwx");
		assertEquals("S;hUxK;hwSbUxK;hwhUxKbUxK;hwhxKbUxK;hwhxJbUxK;hwhxwbUxK;ERROR", cfgLl1Parser.parse("hwhxwtht"));
	}

}