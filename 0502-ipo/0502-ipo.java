class Solution {
    public static class Project{
        int capital;
        int profits;

        Project(int capital,int profits){
            this.capital=capital;
            this.profits=profits;
        }
    }
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        List<Project> projects = new ArrayList<>();

        for(int i=0;i<n;i++){
            projects.add(new Project(capital[i],profits[i]));
        }

        Collections.sort(projects,(a,b)->a.capital-b.capital);
        
        PriorityQueue<Integer> hp = new PriorityQueue<>((x,y)-> y-x);
        int i=0;

        for(int j=0;j<k;j++){
            while(i<n && projects.get(i).capital <= w){
                hp.add(projects.get(i).profits);
                i++;
            }

            if(hp.isEmpty()){
                break;
            }
            w = w + hp.poll();
        }
        return w;

    }
}