package csen1002.main.task8;

import java.util.*;
/**
 * Write your info here
 * 
 * @name Ahmed Karara
 * @id 49-2607
 * @labNumber 15
 */

public class CfgLl1Parser {


	/**
	 * Constructs a Context Free Grammar
	 * 
	 * @param cfg A formatted string representation of the CFG, the First sets of
	 *            each right-hand side, and the Follow sets of each variable. The
	 *            string representation follows the one in the task description
	 */


	ArrayList<String> variables;
	ArrayList<String> terminals;
	HashMap<String,String> rules;
	HashMap<String,String> parsingTable = new LinkedHashMap<>();
	HashMap<String,ArrayList<String>> first = new LinkedHashMap<>();
	HashMap<String,ArrayList<String>> follow = new LinkedHashMap<>();
	ArrayList<String> RULES;
	String input;


	public CfgLl1Parser(String input) {
		this.input = input;
        variables=new ArrayList<>(Arrays.asList(input.split("#")[0].split(";")));
		terminals=new ArrayList<>(Arrays.asList(input.split("#")[1].split(";")));
		rules= initRules(input.split("#")[2].split(";"));
		RULES= new ArrayList<>(Arrays.asList(input.split("#")[2].split(";")));
		initFirstFollow();
		initParsingTable();
//		printHashTablez(parsingTable);

	}

	private void initFirstFollow() {
		for (String t: terminals){
			ArrayList<String> arr= new ArrayList<>();
			arr.add(t);
			first.put(t, arr);
		}
		ArrayList<String> arr= new ArrayList<>();
		arr.add("e");
		first.put("e", arr);
		String [] I= input.split("#")[3].split(";");
		String [] O= input.split("#")[4].split(";");
		for (String s: I){
			ArrayList<String> a = new ArrayList<>(Arrays.asList(s.substring(2).split(",")));
			first.put(s.charAt(0)+"",a);
		}
		for (String s: O){
			ArrayList<String> a = new ArrayList<>(Arrays.asList(s.split("/")[1].replace("",",").split(",")));
			follow.put(s.charAt(0)+"",a);
		}


	}


//	private void printHashTablez(HashMap<String, String> table) {
//		for (Map.Entry<String,String> entry: table.entrySet()){
//			System.out.println(entry.getKey()+" "+entry.getValue());
//		}
//	}

	private void initParsingTable() {
		for (String variable: variables){
			for (String terminal: terminals){
				parsingTable.put(variable+terminal,"");
			}
			parsingTable.put(variable+"$","");
	}
	populateParsingTable();
	}

	private void populateParsingTable() {
			for (Map.Entry<String,String> entry: parsingTable.entrySet()){
				String v=entry.getKey().substring(0,1);
				String t=entry.getKey().substring(1);
				parsingTableHelper(entry, v, t);

			}

	}

	private void parsingTableHelper(Map.Entry<String, String> entry, String v, String t) {
		boolean flag=false;
		for (String rule: rules.get(v).split(",")){
			if(first.get(rule.charAt(0)+"").contains(t)){
				parsingTable.put(entry.getKey(),rule);
				flag=true;
				break;
			}
			if(variables.contains(rule.charAt(0)+""))
			{
				if (first.get(rule.charAt(0) + "").contains("e") && follow.get(rule.charAt(0) + "").contains(t)) {
					parsingTable.put(entry.getKey(), rule);
					flag = true;
					break;
				}
			}
			if (first.get(rule.charAt(0)+"").contains("e") && follow.get(v).contains(t)) {
				parsingTable.put(entry.getKey(), rule);
				flag = true;
				break;
			}

		}
		if(!flag){
			parsingTable.put(entry.getKey(),"ERROR");
		}
	}

	public HashMap<String,String> initRules(String [] rules){
		HashMap<String,String> res=new LinkedHashMap<>();
		for (String rule: rules){
			res.put(rule.charAt(0)+"",rule.substring(2));
		}
		return res;
	}

	/**
	 * @param input The string to be parsed by the LL(1) CFG.
	 * 
	 * @return A string encoding a left-most derivation.
	 */

	public String parse(String input) {
		Stack<String> stack= new Stack<>();
		stack.push("$");
		stack.push("S");
		int i=0;
		input+="$";
		String res= "S;";
		String current="S";
		while (!stack.isEmpty()){
			if(i>=input.length()){break;}
			if((input.charAt(i)+"").equals(stack.peek())){
				stack.pop();
				i++;
			}
			else if(variables.contains(stack.peek())){
				if(parsingTable.get(stack.peek()+input.charAt(i)).equals("ERROR")){
					res+="ERROR";
					break;
				}
				else{
					String r= parsingTable.get(stack.peek()+input.charAt(i));
					String var=stack.peek();
					if(parsingTable.get(stack.peek()+input.charAt(i)).equals("e")){
						current=current.replaceFirst(var,"");
					}
					else{
						current = current.replaceFirst(var, r);
					}
					stack.pop();
					if(!r.equals("e"))
					{
						for (int j = r.length() - 1; j >= 0; j--) {
							stack.push(r.charAt(j) + "");
						}
					}


					res+=current+";";
				}
			}
			else{
				res+="ERROR";
				break;
			}

		}
		if(res.charAt(res.length()-1)=='R') {
			return res;
		}

			return res.substring(0, res.length() - 1);
	}

}
