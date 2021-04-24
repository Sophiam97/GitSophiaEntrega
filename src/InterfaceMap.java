import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * ejemplo de uso de interface Map y Clases que lo implementan
 *
 * - Un map es un objeto que mapea claves a valores - No puede tener elementos
 * duplicados. -ALgunas clases que implementan este interfaz: -HashMap
 * -HashTable -ConcurrentHashMao (sincronizada o thread-safe) -LinkedHashMap
 * -EnumMap -TreeMap
 *
 * Un objeto Hashmap es una tabla hash que implementa el interfaz y que permite
 * claves/valores null. Y no está ordenada.
 *
 * @author 34612
 *
 */
public class InterfaceMap {

	public static void main(String[] args) {

		// 1.- Definimos un objeto HashMap llamado vehiculos
		Map<String, Integer> vehiculos = new HashMap<>();

		// 2.- Uso de métodos. ¿Está vacía la estructura?
		boolean estaVacia = vehiculos.isEmpty();
		System.out.println("========================================");
		System.out.println("Ejemplo de uso de HashMap");
		System.out.println("1.- Creamos el HashMap");
		System.out.println("2.- ¿Hay elementos?" + !estaVacia);
		System.out.println("3.- Número de elementos: " + vehiculos.size());
		System.out.println("========================================");

		// 3.- Añadimos objetos a la estructura
		System.out.println("4.- Añadimos 4 elementos");
		vehiculos.put("BMW", 5);
		vehiculos.put("Mercedes", 15);
		vehiculos.put("Seat", 50);
		vehiculos.put("Audi", 4);

		System.out.println("5.- ¿Hay elementos?" + !estaVacia);
		System.out.println("6.- Número de elementos: " + vehiculos.size());
		System.out.println("========================================");

		// Al no estar bajo collection no tenemos un iterator

		// 4.- Recorremos el Hashmap
		// ¿Un set es iterable? sí

		System.out.println("7.- Recorremos las claves con un iterator utilizando el método keySet");
		Set claves = vehiculos.keySet();

		// Ahora que tengo set si puedo recorrerlo con iterator

		Iterator it = claves.iterator();
		Integer tmp = null;
		String clave = null;
		while (it.hasNext()) {
			clave = (String) it.next();
			System.out.println("Clave: " + clave + " / Valor: " + vehiculos.get(clave));
		}
		// 6.- Buscar una clave
		System.out.println("9.- Buscar una clave en un HAshMap");
		String keySearch = "BMW";

		if (vehiculos.containsKey(keySearch)) {
			System.out.println("La clave " + keySearch + "está en el HashMap");
		} else {
			System.out.println("La clave " + keySearch + "NO está en el HashMap");
		}

		// 7.- Limpiar el HashMap
		System.out.println("10.- Limpiar el HashMap");
		vehiculos.clear();
		System.out.println("11.- Hay elementos?" + !vehiculos.isEmpty());
		System.out.println("12.- Número de elementos: " + vehiculos.size());
		System.out.println("==============================================");
	}
}
