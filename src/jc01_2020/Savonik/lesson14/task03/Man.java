package jc01_2020.Savonik.lesson14.task03;

import java.io.Serializable;

public class Man implements Serializable {
        private static final long serialVersionUID = 1L;
        public String name;
        public int weight;
        public transient int age;
        
        public Man(String name, int weight, int age) {
            this.name = name;
            this.weight = weight;
            this.age = age;
        }
}
