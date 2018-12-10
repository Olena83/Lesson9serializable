package homework9part1;

import java.io.Serializable;


    //Серіалізація об"єкта Person
    public class Person implements Serializable {
        private static final long serialVersionUID = 1L;

        private String name= "Nadiya";
        public String surname= "Biluk";
        //   2. змінено модифікатор доступу по age з public на private ,3.додано transient в поле age
        transient private int age=6;

        //    public Person(String name, String surname, int age) {
//        this.name = name;
//        this.surname = surname;
//        this.age = age;
//    }
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getSurname() {
            return surname;
        }

        @Override
        public String toString() {
            return "Person: " +", name: "+ name+
                    ", surname: "+surname +
                    ", age: " + age ;
        }
    }


