package WebLink.AnudipLink;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

@ComponentScan(basePackages="SimpleLink.Controller")

public class AnudipSimpleHome 
{
	@RequestMapping(value="Anudip",method=RequestMethod.GET)

	//(method=RequestMethod.GET ) This process GET is default
	public String sample()
	{
		return"<body bgcolor='yellow'text='Black'><center><h1>Anudip Foundation</h1><h2> <a=href=\"https:aln.anudip.org\">https:aln.anudip.org</a></h2></center></body>";
		
	}

}
