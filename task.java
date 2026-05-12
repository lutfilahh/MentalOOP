  public class task{
      private int id;
      private String title;

      public task(int id, String title){
          this.id = id;
          this.title = title;
      }

      // Getters and Setters
      public int getId(){ return id; }
      public String getTitle(){ return title; }
      public void setTitle(String title){ this.title = title; }

      @Override
      public String toString(){
          return "Task ID: " + id + " | Title: " + title;
      }
  }