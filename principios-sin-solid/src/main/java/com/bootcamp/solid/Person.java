package com.bootcamp.solid;

/*
La anotación @Data está en la clase y genera los métodos setter / getter,
equals, canEqual, hashCode, toString. Si es un atributo final, no se generará ningún método setter para el atributo
@Data
* */
/*
	@Getter
	@Setter
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	*/
public class Person implements IPrototype, IPersonProxyInterface {	
	
	private String name;
	
	private int age;	
	
	/*@Override
	public Person clone() {
		return new Person(this.name,this.age);
	}*/
	
	@Override
	public Person getClone() {
		return new Person(this);
	}	
	
	public Person (Person person) {
		this.name = person.name;
		this.age = person.age;
	}


	/*
	private Person(PersonBuilder personBuilder) {
		super();
		this.name = personBuilder.name;
		this.age = personBuilder.age;
	}


	public static PersonBuilder builder() {
		return new PersonBuilder();
	}

	public static class PersonBuilder {

		private String name;

		private int age;

		public PersonBuilder name (String name) {
			this.name = name;
			return this;
		}

		public PersonBuilder age (int age) {
			this.age = age;
			return this;
		}

		public Person build () {
			return new Person(this);
		}

	}
*/
	@Override
	public void operacion() {
		System.out.println("Ejecutando operación");		
	}

}