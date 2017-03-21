package gas;

public class Main {

	public static void main(String[] args) {
		//создаем экземпляр(объект) класса Gasoline
		Gasoline gas = new Gasoline();
		//вызываем методы Distance,Consumption,Price,Result объекта gas
		gas.Distance();
		gas.Consumption();
		gas.Price();
		gas.Fuel();
		gas.Result(gas.Fuel(),gas.Price());
		System.out.println("Понадобится "+gas.Fuel()+" литров топлива на сумму "+gas.Result(gas.Fuel(),gas.Price())+" рублей");
	}

}
