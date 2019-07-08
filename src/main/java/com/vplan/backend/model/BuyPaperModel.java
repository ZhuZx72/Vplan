package com.vplan.backend.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class BuyPaperModel implements Serializable {

    private static final long serialVersionUID = 1562149952466L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer user_id;

    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer paper_id;

    /**
    * 购买时间
    * isNullAble:1
    */
    private java.time.LocalDateTime time;


    public void setUser_id(Integer user_id){this.user_id = user_id;}

    public Integer getUser_id(){return this.user_id;}

    public void setPaper_id(Integer paper_id){this.paper_id = paper_id;}

    public Integer getPaper_id(){return this.paper_id;}

    public void setTime(java.time.LocalDateTime time){this.time = time;}

    public java.time.LocalDateTime getTime(){return this.time;}
    @Override
    public String toString() {
        return "BuyPaperModel{" +
                "user_id='" + user_id + '\'' +
                "paper_id='" + paper_id + '\'' +
                "time='" + time + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private BuyPaperModel set;

        private ConditionBuilder where;

        public UpdateBuilder set(BuyPaperModel set){
            this.set = set;
            return this;
        }

        public BuyPaperModel getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends BuyPaperModel{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> user_idList;

        public List<Integer> getUser_idList(){return this.user_idList;}

        private Integer user_idSt;

        private Integer user_idEd;

        public Integer getUser_idSt(){return this.user_idSt;}

        public Integer getUser_idEd(){return this.user_idEd;}

        private List<Integer> paper_idList;

        public List<Integer> getPaper_idList(){return this.paper_idList;}

        private Integer paper_idSt;

        private Integer paper_idEd;

        public Integer getPaper_idSt(){return this.paper_idSt;}

        public Integer getPaper_idEd(){return this.paper_idEd;}

        private List<java.time.LocalDateTime> timeList;

        public List<java.time.LocalDateTime> getTimeList(){return this.timeList;}

        private java.time.LocalDateTime timeSt;

        private java.time.LocalDateTime timeEd;

        public java.time.LocalDateTime getTimeSt(){return this.timeSt;}

        public java.time.LocalDateTime getTimeEd(){return this.timeEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder user_idBetWeen(Integer user_idSt,Integer user_idEd){
            this.user_idSt = user_idSt;
            this.user_idEd = user_idEd;
            return this;
        }

        public QueryBuilder user_idGreaterEqThan(Integer user_idSt){
            this.user_idSt = user_idSt;
            return this;
        }
        public QueryBuilder user_idLessEqThan(Integer user_idEd){
            this.user_idEd = user_idEd;
            return this;
        }


        public QueryBuilder user_id(Integer user_id){
            setUser_id(user_id);
            return this;
        }

        public QueryBuilder user_idList(Integer ... user_id){
            this.user_idList = solveNullList(user_id);
            return this;
        }

        public QueryBuilder user_idList(List<Integer> user_id){
            this.user_idList = user_id;
            return this;
        }

        public QueryBuilder fetchUser_id(){
            setFetchFields("fetchFields","user_id");
            return this;
        }

        public QueryBuilder excludeUser_id(){
            setFetchFields("excludeFields","user_id");
            return this;
        }

        public QueryBuilder paper_idBetWeen(Integer paper_idSt,Integer paper_idEd){
            this.paper_idSt = paper_idSt;
            this.paper_idEd = paper_idEd;
            return this;
        }

        public QueryBuilder paper_idGreaterEqThan(Integer paper_idSt){
            this.paper_idSt = paper_idSt;
            return this;
        }
        public QueryBuilder paper_idLessEqThan(Integer paper_idEd){
            this.paper_idEd = paper_idEd;
            return this;
        }


        public QueryBuilder paper_id(Integer paper_id){
            setPaper_id(paper_id);
            return this;
        }

        public QueryBuilder paper_idList(Integer ... paper_id){
            this.paper_idList = solveNullList(paper_id);
            return this;
        }

        public QueryBuilder paper_idList(List<Integer> paper_id){
            this.paper_idList = paper_id;
            return this;
        }

        public QueryBuilder fetchPaper_id(){
            setFetchFields("fetchFields","paper_id");
            return this;
        }

        public QueryBuilder excludePaper_id(){
            setFetchFields("excludeFields","paper_id");
            return this;
        }

        public QueryBuilder timeBetWeen(java.time.LocalDateTime timeSt,java.time.LocalDateTime timeEd){
            this.timeSt = timeSt;
            this.timeEd = timeEd;
            return this;
        }

        public QueryBuilder timeGreaterEqThan(java.time.LocalDateTime timeSt){
            this.timeSt = timeSt;
            return this;
        }
        public QueryBuilder timeLessEqThan(java.time.LocalDateTime timeEd){
            this.timeEd = timeEd;
            return this;
        }


        public QueryBuilder time(java.time.LocalDateTime time){
            setTime(time);
            return this;
        }

        public QueryBuilder timeList(java.time.LocalDateTime ... time){
            this.timeList = solveNullList(time);
            return this;
        }

        public QueryBuilder timeList(List<java.time.LocalDateTime> time){
            this.timeList = time;
            return this;
        }

        public QueryBuilder fetchTime(){
            setFetchFields("fetchFields","time");
            return this;
        }

        public QueryBuilder excludeTime(){
            setFetchFields("excludeFields","time");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public BuyPaperModel build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> user_idList;

        public List<Integer> getUser_idList(){return this.user_idList;}

        private Integer user_idSt;

        private Integer user_idEd;

        public Integer getUser_idSt(){return this.user_idSt;}

        public Integer getUser_idEd(){return this.user_idEd;}

        private List<Integer> paper_idList;

        public List<Integer> getPaper_idList(){return this.paper_idList;}

        private Integer paper_idSt;

        private Integer paper_idEd;

        public Integer getPaper_idSt(){return this.paper_idSt;}

        public Integer getPaper_idEd(){return this.paper_idEd;}

        private List<java.time.LocalDateTime> timeList;

        public List<java.time.LocalDateTime> getTimeList(){return this.timeList;}

        private java.time.LocalDateTime timeSt;

        private java.time.LocalDateTime timeEd;

        public java.time.LocalDateTime getTimeSt(){return this.timeSt;}

        public java.time.LocalDateTime getTimeEd(){return this.timeEd;}


        public ConditionBuilder user_idBetWeen(Integer user_idSt,Integer user_idEd){
            this.user_idSt = user_idSt;
            this.user_idEd = user_idEd;
            return this;
        }

        public ConditionBuilder user_idGreaterEqThan(Integer user_idSt){
            this.user_idSt = user_idSt;
            return this;
        }
        public ConditionBuilder user_idLessEqThan(Integer user_idEd){
            this.user_idEd = user_idEd;
            return this;
        }


        public ConditionBuilder user_idList(Integer ... user_id){
            this.user_idList = solveNullList(user_id);
            return this;
        }

        public ConditionBuilder user_idList(List<Integer> user_id){
            this.user_idList = user_id;
            return this;
        }

        public ConditionBuilder paper_idBetWeen(Integer paper_idSt,Integer paper_idEd){
            this.paper_idSt = paper_idSt;
            this.paper_idEd = paper_idEd;
            return this;
        }

        public ConditionBuilder paper_idGreaterEqThan(Integer paper_idSt){
            this.paper_idSt = paper_idSt;
            return this;
        }
        public ConditionBuilder paper_idLessEqThan(Integer paper_idEd){
            this.paper_idEd = paper_idEd;
            return this;
        }


        public ConditionBuilder paper_idList(Integer ... paper_id){
            this.paper_idList = solveNullList(paper_id);
            return this;
        }

        public ConditionBuilder paper_idList(List<Integer> paper_id){
            this.paper_idList = paper_id;
            return this;
        }

        public ConditionBuilder timeBetWeen(java.time.LocalDateTime timeSt,java.time.LocalDateTime timeEd){
            this.timeSt = timeSt;
            this.timeEd = timeEd;
            return this;
        }

        public ConditionBuilder timeGreaterEqThan(java.time.LocalDateTime timeSt){
            this.timeSt = timeSt;
            return this;
        }
        public ConditionBuilder timeLessEqThan(java.time.LocalDateTime timeEd){
            this.timeEd = timeEd;
            return this;
        }


        public ConditionBuilder timeList(java.time.LocalDateTime ... time){
            this.timeList = solveNullList(time);
            return this;
        }

        public ConditionBuilder timeList(List<java.time.LocalDateTime> time){
            this.timeList = time;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private BuyPaperModel obj;

        public Builder(){
            this.obj = new BuyPaperModel();
        }

        public Builder user_id(Integer user_id){
            this.obj.setUser_id(user_id);
            return this;
        }
        public Builder paper_id(Integer paper_id){
            this.obj.setPaper_id(paper_id);
            return this;
        }
        public Builder time(java.time.LocalDateTime time){
            this.obj.setTime(time);
            return this;
        }
        public BuyPaperModel build(){return obj;}
    }

}
