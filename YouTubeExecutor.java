class YouTubeExecutor{

    public static void main(String[] args) {

        YouTube ref = new YouTube();

        boolean added = ref.addVideoTitle("Java Basics Tutorial");
        System.out.println(added);

        added = ref.addVideoTitle("OOP Concepts in Java");
        System.out.println(added);

        added = ref.addVideoTitle("Data Structures Introduction");
        System.out.println(added);

        added = ref.addVideoTitle("Spring Boot Crash Course");
        System.out.println(added);

        added = ref.addVideoTitle("Hibernate Tutorial");
        System.out.println(added);

        added = ref.addVideoTitle("Frontend Development Guide");
        System.out.println(added);

        added = ref.addVideoTitle("React JS Full Course");
        System.out.println(added);

        added = ref.addVideoTitle("JavaScript Basics");
        System.out.println(added);

        added = ref.addVideoTitle("Python for Beginners");
        System.out.println(added);

        added = ref.addVideoTitle("Machine Learning Intro");
        System.out.println(added);

        added = ref.addVideoTitle("AI Explained");
        System.out.println(added);

        added = ref.addVideoTitle("Cloud Computing Basics");
        System.out.println(added);

        added = ref.addVideoTitle("Docker Tutorial");
        System.out.println(added);

        added = ref.addVideoTitle("Kubernetes Explained");
        System.out.println(added);

        added = ref.addVideoTitle("System Design Basics");
        System.out.println(added);

        ref.getVideoTitles();
		
		String name = ref.getTitleByName("React JS Full Course");
		System.out.println(name);
		
		boolean update = ref.updateTitle("React JS Full Course", "React Js");
		System.out.println(update);
		
		ref.getVideoTitles();
		
		boolean delete = ref.deleteTitle("Python for Beginners");
		System.out.println(delete);
		
		ref.getVideoTitles();
    }
}
