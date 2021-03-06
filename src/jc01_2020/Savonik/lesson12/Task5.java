package jc01_2020.Savonik.lesson12;

/*
 *
 * Создать класс Cat со строковым полем имени и числовым полем для количества оставшихся жизней. Создать функциональный
 * интерфейс, который сравнит двух котов и вернет имя кота с большим количеством жизней.
 *
 */

public class Task5 {

	@FunctionalInterface
	private interface CompareLife {
		String compareLife(Cat kotik1, Cat kotik2);
	}
	public static void main(String[] args) {
		Cat kotenok = new Cat("Kotenok", 5);
		Cat kotenochek = new Cat("Kotenochek", 5);
		
		CompareLife compared = (cat1, cat2) -> {
			if (cat1.getLifeAmount()==cat2.getLifeAmount()) { return "количество жизней равно"; } 
			else
				return (cat1.getLifeAmount()>cat2.getLifeAmount()? cat1.getName():cat2.getName());
		};
		
			System.out.println(compared.compareLife(kotenok, kotenochek));
	}
	
	public static class Cat {
		String name;
		int lifeAmount;

		public Cat (String name, int lifeAmount){
			this.name = name;
			this.lifeAmount = lifeAmount;
		}

		public String getName() {
			return name;
		}

		public int getLifeAmount() {
			return lifeAmount;
		}
	}
}
