public class ProjectTest {
    public static void main(String[] args){
        Project p = new Project("mia","baby");
        p.getName();
        System.out.println(p.getName());
        System.out.println(p.getDescription());

        p.setName("Maxine");
        System.out.println(p.getName());
    
        System.out.println(p.elevatorPitch());

            
        }
    


    }

