class CourseExecutor{

    public static void main(String[] args){

        Course course = new Course();

        boolean added = course.addTechnology("Java");
        System.out.println(added);
        System.out.println("---------------");

        added = course.addTechnology("Python");
        System.out.println(added);
        System.out.println("---------------");

        added = course.addTechnology("C");
        System.out.println(added);
        System.out.println("---------------");

        added = course.addTechnology("C++");
        System.out.println(added);
        System.out.println("---------------");

        added = course.addTechnology("JavaScript");
        System.out.println(added);
        System.out.println("---------------");

        added = course.addTechnology("HTML");
        System.out.println(added);
        System.out.println("---------------");

        added = course.addTechnology("CSS");
        System.out.println(added);
        System.out.println("---------------");

        added = course.addTechnology("Spring Boot");
        System.out.println(added);
        System.out.println("---------------");

        added = course.addTechnology("Hibernate");
        System.out.println(added);
        System.out.println("---------------");

        added = course.addTechnology("React");
        System.out.println(added);
        System.out.println("---------------");

        added = course.addTechnology("Angular");
        System.out.println(added);
        System.out.println("---------------");

        added = course.addTechnology("Node.js");
        System.out.println(added);
        System.out.println("---------------");

        added = course.addTechnology("MySQL");
        System.out.println(added);
        System.out.println("---------------");

        added = course.addTechnology("MongoDB");
        System.out.println(added);
        System.out.println("---------------");

        added = course.addTechnology("Docker");
        System.out.println(added);
        System.out.println("---------------");

  
        course.getTechnologies();
		
		String name = course.getTechnologyByName("React");
		System.out.println(name + " is available");
		
		boolean update = course.updateTechnologyName("MongoDB" , "Neo4j");
		System.out.println(update);
		
		course.getTechnologies();
		
		boolean delete = course.deleteTechnology("React");
		System.out.println(delete);
		
		course.getTechnologies();
    }
}