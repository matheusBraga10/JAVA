package br.com.erudio.controlers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.converters.NumberConverter;
import br.com.erudio.math.SimpleMath;

@RestController
public class MathController {

	private final AtomicLong counter = new AtomicLong();
	
	private  SimpleMath math = new SimpleMath();
	
	@RequestMapping(value="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))  {
			throw new UnsupportedOperationException("Please set a numeric value!");
		}
		return math.sum(NumberConverter.convertToDouble(numberOne) , NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/subtraction/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double subtraction(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))  {
			throw new UnsupportedOperationException("Please set a numeric value!");
		}
		return math.subtraction(NumberConverter.convertToDouble(numberOne) , NumberConverter.convertToDouble(numberTwo));
	}

	@RequestMapping(value="/multiplication/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double multiplication(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))  {
			throw new UnsupportedOperationException("Please set a numeric value!");
		}
		return math.multiplication(NumberConverter.convertToDouble(numberOne) , NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/division/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double division(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {  
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))  {
			throw new UnsupportedOperationException("Please set a numeric value!");
		}
		return math.division(NumberConverter.convertToDouble(numberOne) , NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/squareRoot/{numberOne}", method=RequestMethod.GET)
	public Double squareRoot(@PathVariable(value = "numberOne") String numberOne) throws Exception {
		if(!NumberConverter.isNumeric(numberOne))  {
			throw new UnsupportedOperationException("Please set a numeric value!");
		}
		return math.squareRoot(NumberConverter.convertToDouble(numberOne));
	}
	
	@RequestMapping(value="/media/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double media(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))  {
			throw new UnsupportedOperationException("Please set a numeric value!");
		}
		return math.media(NumberConverter.convertToDouble(numberOne) , NumberConverter.convertToDouble(numberTwo));
	}
	

	 
}
