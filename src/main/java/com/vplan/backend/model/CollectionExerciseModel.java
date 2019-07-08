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
public class CollectionExerciseModel implements Serializable {

    private static final long serialVersionUID = 1562149964626L;


    /**
    * 主键
    * 用户id
    * isNullAble:0
    */
    private Integer user_id;

    /**
    * 主键
    * 问题id
    * isNullAble:0
    */
    private Integer exercise_id;

    /**
    * 收藏时间
    * isNullAble:1
    */
    private java.time.LocalDateTime time;


    public void setUser_id(Integer user_id){this.user_id = user_id;}

    public Integer getUser_id(){return this.user_id;}

    public void setExercise_id(Integer exercise_id){this.exercise_id = exercise_id;}

    public Integer getExercise_id(){return this.exercise_id;}

    public void setTime(java.time.LocalDateTime time){this.time = time;}

    public java.time.LocalDateTime getTime(){return this.time;}
    @Override
    public String toString() {
        return "CollectionExerciseModel{" +
                "user_id='" + user_id + '\'' +
                "exercise_id='" + exercise_id + '\'' +
                "time='" + time + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private CollectionExerciseModel set;

        private ConditionBuilder where;

        public UpdateBuilder set(CollectionExerciseModel set){
            this.set = set;
            return this;
        }

        public CollectionExerciseModel getSet(){
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

    public static class QueryBuilder extends CollectionExerciseModel{
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

        private List<Integer> exercise_idList;

        public List<Integer> getExercise_idList(){return this.exercise_idList;}

        private Integer exercise_idSt;

        private Integer exercise_idEd;

        public Integer getExercise_idSt(){return this.exercise_idSt;}

        public Integer getExercise_idEd(){return this.exercise_idEd;}

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

        public QueryBuilder exercise_idBetWeen(Integer exercise_idSt,Integer exercise_idEd){
            this.exercise_idSt = exercise_idSt;
            this.exercise_idEd = exercise_idEd;
            return this;
        }

        public QueryBuilder exercise_idGreaterEqThan(Integer exercise_idSt){
            this.exercise_idSt = exercise_idSt;
            return this;
        }
        public QueryBuilder exercise_idLessEqThan(Integer exercise_idEd){
            this.exercise_idEd = exercise_idEd;
            return this;
        }


        public QueryBuilder exercise_id(Integer exercise_id){
            setExercise_id(exercise_id);
            return this;
        }

        public QueryBuilder exercise_idList(Integer ... exercise_id){
            this.exercise_idList = solveNullList(exercise_id);
            return this;
        }

        public QueryBuilder exercise_idList(List<Integer> exercise_id){
            this.exercise_idList = exercise_id;
            return this;
        }

        public QueryBuilder fetchExercise_id(){
            setFetchFields("fetchFields","exercise_id");
            return this;
        }

        public QueryBuilder excludeExercise_id(){
            setFetchFields("excludeFields","exercise_id");
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

        public CollectionExerciseModel build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> user_idList;

        public List<Integer> getUser_idList(){return this.user_idList;}

        private Integer user_idSt;

        private Integer user_idEd;

        public Integer getUser_idSt(){return this.user_idSt;}

        public Integer getUser_idEd(){return this.user_idEd;}

        private List<Integer> exercise_idList;

        public List<Integer> getExercise_idList(){return this.exercise_idList;}

        private Integer exercise_idSt;

        private Integer exercise_idEd;

        public Integer getExercise_idSt(){return this.exercise_idSt;}

        public Integer getExercise_idEd(){return this.exercise_idEd;}

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

        public ConditionBuilder exercise_idBetWeen(Integer exercise_idSt,Integer exercise_idEd){
            this.exercise_idSt = exercise_idSt;
            this.exercise_idEd = exercise_idEd;
            return this;
        }

        public ConditionBuilder exercise_idGreaterEqThan(Integer exercise_idSt){
            this.exercise_idSt = exercise_idSt;
            return this;
        }
        public ConditionBuilder exercise_idLessEqThan(Integer exercise_idEd){
            this.exercise_idEd = exercise_idEd;
            return this;
        }


        public ConditionBuilder exercise_idList(Integer ... exercise_id){
            this.exercise_idList = solveNullList(exercise_id);
            return this;
        }

        public ConditionBuilder exercise_idList(List<Integer> exercise_id){
            this.exercise_idList = exercise_id;
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

        private CollectionExerciseModel obj;

        public Builder(){
            this.obj = new CollectionExerciseModel();
        }

        public Builder user_id(Integer user_id){
            this.obj.setUser_id(user_id);
            return this;
        }
        public Builder exercise_id(Integer exercise_id){
            this.obj.setExercise_id(exercise_id);
            return this;
        }
        public Builder time(java.time.LocalDateTime time){
            this.obj.setTime(time);
            return this;
        }
        public CollectionExerciseModel build(){return obj;}
    }

}
