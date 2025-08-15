//task manager 
import java.util.*;

class Task
{
    private int taskId;
    private String taskName;
    private String priority;
    private String deadLine;
    private String status;
    public Task(int taskId,String taskName,String priority, String deadLine,String status)
    {
        this.taskId=taskId;
        this.taskName=taskName;
        this.priority=priority;
        this.deadLine=deadLine;
        this.status=status;
    }
    
    public void setTaskId(int taskId)
    {
        this.taskId=taskId;
    }
    public int getTaskId()
    {
        return taskId;
    }
    public void setTaskName(String taskName)
    {
        this.taskName=taskName;
    }
    public String getTaskName()
    {
        return taskName;
    }
     public void setPriority(String priority)
    {
        this.priority=priority;
    }
    public String getPriority()
    {
        return priority;
    }

     public void setDeadLine(String deadLine)
    {
        this.deadLine=deadLine;
    }
    public String getDate()
    {
        return deadLine;
    }

     public void setStatus(String status)
    {
        this.status=status;
    }
    public String getStatus()
    {
        return status;
    }
    


    
    
}
class TaskOperations
{
    
    public void addTask(Scanner sc, ArrayList<Task> TaskList)
    {
        System.out.println("Enter the Task Id:");
        int taskId=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Task Name:");
        String taskName=sc.nextLine();
        System.out.println("Enter the Task Priority:");
        String priority=sc.nextLine();
        System.out.println("Enter the Task DeadLine");
        String deadline=sc.nextLine();
        System.out.println("Enter the Task Status:");
        String status=sc.nextLine();
        
        
        Task task=new Task(taskId,taskName,priority,deadline,status);
        
        TaskList.add(task);
        
    }
    
    public void listTask(ArrayList<Task> taskList)
    {
        for(Task t: taskList)
        {
            System.out.println("Task Id:"+ t.getTaskId());
            System.out.println("Task Name:"+ t.getTaskName());
            System.out.println("Task Priority:"+ t.getPriority());
            System.out.println("Task Date:"+ t.getDate());
            System.out.println("Task Status:"+ t.getStatus());
            
        }
    }
    public void updateTask(Scanner sc, ArrayList<Task> taskList)
    {
        System.out.println("Choose the Id to Update");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("1. Update Name\n 2. Update Priority\n 3. Update DeadLine\4. Update Status");
        
        //have to take the object from the ArrayList
        Task obj=null;
        for(int i=0;i<taskList.size();i++)
        {
            if(taskList.get(i).getTaskId()==id)
            {
               obj=taskList.get(i);
               break;
            }
        }
        
        if(obj!=null)
        {
        
            switch(id)
            {
                case 1:
                    System.out.println("Enter the New Name:");
                    String updateName=sc.nextLine();
                    obj.setTaskName(updateName);
                    break;
                    
                case 2:
                    System.out.println("Enter the New Priority:");
                    String updatePriority=sc.nextLine();
                    obj.setPriority(updatePriority);
                    break;
                case 3:
                    System.out.println("Enter the New DeadLine:");
                    String updateDeadLine=sc.nextLine();
                    obj.setDeadLine(updateDeadLine);
                    break;
                case 4:
                    System.out.println("Enter the New Status:");
                    String updateStatus=sc.nextLine();
                    obj.setStatus(updateStatus);
                    break;
                default:
                    break;
                
            }
        }
    }
}
public class Main
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Task> taskList=new ArrayList<Task>();
        TaskOperations taskOps=new TaskOperations();
        System.out.println("=====Task Manager=====");
        // System.out.println("Choose an option");
        int option=0;
        while(option!=6)
        {
            System.out.println("1. Add Task\n2. Update Task \n3. Delete Task\n4. List All Tasks\n5. Search Task\6. Exit");
            System.out.println("Choose an option");
            option=sc.nextInt();
            
            switch(option)
            {
                case 1:
                    taskOps.addTask(sc,taskList);
                    break;
                case 2:
                    taskOps.updateTask(sc,taskList);
                    break;
                // case 3:
                //     deleteTask();
                //     break;
                    
                case 4:
                    taskOps.listTask(taskList);
                    break;
                    
                // case 5:
                //     searchTask();
                //     break
                    
                // case 6:
                //     break;
                    
                default:
                    break;
            }
            
        }
        
    }
}
