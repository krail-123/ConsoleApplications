//task manager 
import java.util.*;
ArrayList<Task> taskList=new ArrayList<>();
class Task
{
    private int taskId;
    private String taskName;
    private String priority;
    private String deadLine;
    private String status;
    task(int taskId,String taskName,String priority, String deadLine,String status)
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
        this.taskname=taskname;
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

     public void setDate(String date)
    {
        this.date=date;
    }
    public String getDate()
    {
        return Date;
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
    
    public void addTask()
    {
        System.out.println("Enter the Task Id:");
        int taskId=sc.nextInt();
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
    
    public void listTask()
    {
        for(task t: taskList)
        {
            System.out.println("Task Id:"+ t.getTaskId());
            System.out.println("Task Name:"+ t.getTaskName());
            System.out.println("Task Priority:"+ t.getPriority());
            System.out.println("Task Date:"+ t.getDate());
            System.out.println("Task Status:"+ t.getStatus());
            
        }
    }
}
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("=====Task Manager=====");
        // System.out.println("Choose an option");
        int option=0;
        while(option!=6)
        {
            System.out.println("1. Add Task\n2. Update Task \n3. Delete Task\n4. List All Tasks\n5. Search Task\6. Exit");
            System.out.println("Choose an option");
            option=sc.nextInt();
            
            switch(option):
            {
                case 1:
                    TaskOperations.addTask();
                    break;
                case 2:
                    updateTask();
                    break;
                case 3:
                    deleteTask();
                    break;
                    
                case 4:
                    listTask();
                    break;
                    
                case 5:
                    searchTask();
                    break
                    
                case 6:
                    break;
                    
                default:
                    break;
            }
            
        }
        
    }
}