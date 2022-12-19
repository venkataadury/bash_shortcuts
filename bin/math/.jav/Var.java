import java.io.*;
import java.util.HashMap;
import maths.*;
import commons.*;
public class Var extends Emulator
{
	GLine gline; Point pt; double val; Angle agl;
	String name;
	char type;
	boolean[] status=new boolean[] {false,false,false};
	Var() {}
	Var(String vname)
	{
		type=(char)0;
		name=vname;
		status[0]=true;
	}
	Var(String vname,char tp)
	{
		type=(tp=='E')?'V':tp;
		name=vname;
		setVariable(tp);
		status[0]=status[1]=true;
	}
	Var(String vname,char tp,String value)
	{
		type=tp;
		name=vname;
		setVariable(tp,value);
		status[0]=status[1]=true;
	}
	void printIt()
	{
		switch(type)
		{
			case 'L':
				if(status[2])
					gline.printEqn();
				else
					X.sopln("Not assigned value. ","Red");
				break;
			case 'P':
				if(status[2])
					pt.printPoint();
				else
					X.sopln("Not assigned value. ","Red");
				break;
			case 'V':
				if(status[2])
					X.sopln(val);
				else
					X.sopln("Not assigned value. ","Red");
				break;
			case 'A':
				if(status[2])
					X.sopln(agl.angleD);
				else
					X.sopln("Not assigned value. ","Red");
				break;
			default:
				X.sopln("Invalid format reached");
		}
	}
	String getValue()
	{
		switch(type)
		{
			case 'L':
				if(status[2])
					return(gline.getEqn());
				else
					X.sopln("Not assigned value. ","Red");
				break;
			case 'P':
				if(status[2])
					return pt.pointValue();
				else
					X.sopln("Not assigned value. ","Red");
				break;
			case 'V':
				if(status[2])
					return Integer.toString((int)val);
				else
					X.sopln("Not assigned value. ","Red");
				break;
			case 'A':
				if(status[2])
					return Integer.toString((int)agl.angleD);
				else
					X.sopln("Not assigned value. ","Red");
				break;
			default:
				X.sopln("Invalid format reached");
				return "";
		}
		return "";
	}
	void setVariable(char t)
	{
		switch(t)
		{
			case 'L':
				gline=new GLine();
				break;
			case 'P':
				pt=new Point();
				break;
			case 'V':
				val=(double)0;
				break;
			case 'A':
				agl=new Angle();
				break;
			default:
				X.sopln("Error in Var.setVariable..\nfrom Var.<init>\nInvalid variable type '"+t+"' received.","red");
		}
	}
	void setVariable(char t,String value)
	{
		switch(t)
		{
			case 'L':
				gline=new GLine(parseLine(value));
				status[2]=true;
				break;
			case 'P':
				pt=new Point(parsePoint(value));
				status[2]=true;
				break;
			case 'V':
				val=X.dpd(value);
				status[2]=true;
				break;
			case 'A':
				agl=new Angle(X.dpd(value));
				status[2]=true;
				break;
			default:
				X.sopln("Error in Var.setVariable..\nfrom Var.<init>\nInvalid variable type '"+t+"' received.","red");
		}
	}
	String parsePoint(String ps)
	{
		if(!X.haschar(ps,','))
		{
			X.sopln("Invalid Point: "+ps,"red");
			return "(0,0)";
		}
		if(!ps.startsWith("("))
			ps="("+ps;
		if(!ps.endsWith(")"))
			ps=ps+")";
		return ps;
	}
	String parseLine(String ps)
	{
		// xi, 7 yi 12
		// y=4x + 5
		if(X.haschar(ps,'x') && X.haschar(ps,'y') && X.haschar(ps,'='))
		{
			if(X.haschar(ps,' '))
				return ps;
			else
			{
				X.sopln("Not well punctuated. Please add spaces on either side of the '=' sign and the '+' and '-' signs.","red");
				return "y = 1x + 0";
			}
		}
		GLine temp=new GLine(Y.cut(ps,' ',3),Y.cut(ps,' ',5),Y.cut(ps,' ',2),Y.cut(ps,' ',4));
		return temp.getEqn();
	}
}
