package zad1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ListCreator<T> extends ArrayList<T> {
	
	public ListCreator(List<T> lista) {
		this.addAll(lista);
	}
	
	public static <T> ListCreator<T> collectFrom(List <T> list){
		return new ListCreator<>(list);
		
	}

	public ListCreator<T> when(Predicate<T> znajdz) {
		// TODO Auto-generated method stub
		this.removeIf(znajdz.negate());
		return this;
	}
	
	public ListCreator<T> mapEvery(UnaryOperator <T> mapa){
		this.replaceAll(mapa);
		return this;
	}
	
	

}
