package br.com.cod3r.app.financeiro;

import java.util.Arrays;
import java.util.Iterator;

public class Calc2 implements Calc {

	@Override
	public double soma(double... nums) {
		return Arrays.stream(nums).reduce(0.0, (t, a) -> t + a);
//	Implementação com o mesmo resultado que o laço for
	}
}
