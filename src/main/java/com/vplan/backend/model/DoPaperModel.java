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
public class DoPaperModel implements Serializable {

    private static final long serialVersionUID = 1562150099258L;


    /**
    * 主键
    * 用户id
    * isNullAble:0
    */
    private Integer user_id;

    /**
    * 主键
    * 试卷id
    * isNullAble:0
    */
    private Integer paper_id;

    /**
    * 时间
    * isNullAble:1
    */
    private java.time.LocalDateTime time;

    /**
    * 1：完成2：未完成
    * isNullAble:1
    */
    private Integer finish;


    public void setUser_id(Integer user_id){this.user_id = user_id;}

    public Integer getUser_id(){return this.user_id;}

    public void setPaper_id(Integer paper_id){this.paper_id = paper_id;}

    public Integer getPaper_id(){return this.paper_id;}

    public void setTime(java.time.LocalDateTime time){this.time = time;}

    public java.time.LocalDateTime getTime(){return this.time;}

    public void setFinish(Integer finish){this.finish = finish;}

    public Integer getFinish(){return this.finish;}
    @Override
    public String toString() {
        return "DoPaperModel{" +
                "user_id='" + user_id + '\'' +
                "paper_id='" + paper_id + '\'' +
                "time='" + time + '\'' +
                "finish='" + finish + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private DoPaperModel set;

        private ConditionBuilder where;

        public UpdateBuilder set(DoPaperModel set){
            this.set = set;
            return this;
        }

        public DoPaperModel getSet(){
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

    public static class QueryBuilder extends DoPaperModel{
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

        private List<Integer> finishList;

        public List<Integer> getFinishList(){return this.finishList;}

        private Integer finishSt;

        private Integer finishEd;

        public Integer getFinishSt(){return this.finishSt;}

        public Integer getFinishEd(){return this.finishEd;}

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

        public QueryBuilder finishBetWeen(Integer finishSt,Integer finishEd){
            this.finishSt = finishSt;
            this.finishEd = finishEd;
            return this;
        }

        public QueryBuilder finishGreaterEqThan(Integer finishSt){
            this.finishSt = finishSt;
            return this;
        }
        public QueryBuilder finishLessEqThan(Integer finishEd){
            this.finishEd = finishEd;
            return this;
        }


        public QueryBuilder finish(Integer finish){
            setFinish(finish);
            return this;
        }

        public QueryBuilder finishList(Integer ... finish){
            this.finishList = solveNullList(finish);
            return this;
        }

        public QueryBuilder finishList(List<Integer> finish){
            this.finishList = finish;
            return this;
        }

        public QueryBuilder fetchFinish(){
            setFetchFields("fetchFields","finish");
            return this;
        }

        public QueryBuilder excludeFinish(){
            setFetchFields("excludeFields","finish");
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

        public DoPaperModel build(){return this;}
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

        private List<Integer> finishList;

        public List<Integer> getFinishList(){return this.finishList;}

        private Integer finishSt;

        private Integer finishEd;

        public Integer getFinishSt(){return this.finishSt;}

        public Integer getFinishEd(){return this.finishEd;}


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

        public ConditionBuilder finishBetWeen(Integer finishSt,Integer finishEd){
            this.finishSt = finishSt;
            this.finishEd = finishEd;
            return this;
        }

        public ConditionBuilder finishGreaterEqThan(Integer finishSt){
            this.finishSt = finishSt;
            return this;
        }
        public ConditionBuilder finishLessEqThan(Integer finishEd){
            this.finishEd = finishEd;
            return this;
        }


        public ConditionBuilder finishList(Integer ... finish){
            this.finishList = solveNullList(finish);
            return this;
        }

        public ConditionBuilder finishList(List<Integer> finish){
            this.finishList = finish;
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

        private DoPaperModel obj;

        public Builder(){
            this.obj = new DoPaperModel();
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
        public Builder finish(Integer finish){
            this.obj.setFinish(finish);
            return this;
        }
        public DoPaperModel build(){return obj;}
    }

}
