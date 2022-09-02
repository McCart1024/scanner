package test;



    public class WithName {
        private String name;

        public WithName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public static void main(String[] args) {
            WithName withName = new WithName("Joe");
            System.out.println(withName.getName());
        }
    }

