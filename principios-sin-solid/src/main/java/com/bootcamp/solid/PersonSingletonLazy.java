package com.bootcamp.solid;
	public class PersonSingletonLazy {


		private static Person INSTANCE;


		private PersonSingletonLazy() {
			super();
		}


		public static Person getInstance() {
			if (Objects.isNull(INSTANCE)) {
				INSTANCE = new Person();
			}
			return INSTANCE;
		}


