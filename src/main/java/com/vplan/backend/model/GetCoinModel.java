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
public class GetCoinModel implements Serializable {

    private static final long serialVersionUID = 1562150163004L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 用户id
    * isNullAble:0
    */
    private Integer user_id;

    /**
    * 天
    * isNullAble:1
    */
    private java.time.LocalDateTime time;

    /**
    * 当天获得了几个，每次加一个，超过四个则不能获得
    * isNullAble:1
    */
    private Integer count;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setUser_id(Integer user_id){this.user_id = user_id;}

    public Integer getUser_id(){return this.user_id;}

    public void setTime(java.time.LocalDateTime time){this.time = time;}

    public java.time.LocalDateTime getTime(){return this.time;}

    public void setCount(Integer count){this.count = count;}

    public Integer getCount(){return this.count;}
    @Override
    public String toString() {
        return "GetCoinModel{" +
                "id='" + id + '\'' +
                "user_id='" + user_id + '\'' +
                "time='" + time + '\'' +
                "count='" + count + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private GetCoinModel set;

        private ConditionBuilder where;

        public UpdateBuilder set(GetCoinModel set){
            this.set = set;
            return this;
        }

        public GetCoinModel getSet(){
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

    public static class QueryBuilder extends GetCoinModel{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<Integer> user_idList;

        public List<Integer> getUser_idList(){return this.user_idList;}

        private Integer user_idSt;

        private Integer user_idEd;

        public Integer getUser_idSt(){return this.user_idSt;}

        public Integer getUser_idEd(){return this.user_idEd;}

        private List<java.time.LocalDateTime> timeList;

        public List<java.time.LocalDateTime> getTimeList(){return this.timeList;}

        private java.time.LocalDateTime timeSt;

        private java.time.LocalDateTime timeEd;

        public java.time.LocalDateTime getTimeSt(){return this.timeSt;}

        public java.time.LocalDateTime getTimeEd(){return this.timeEd;}

        private List<Integer> countList;

        public List<Integer> getCountList(){return this.countList;}

        private Integer countSt;

        private Integer countEd;

        public Integer getCountSt(){return this.countSt;}

        public Integer getCountEd(){return this.countEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
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

        public QueryBuilder countBetWeen(Integer countSt,Integer countEd){
            this.countSt = countSt;
            this.countEd = countEd;
            return this;
        }

        public QueryBuilder countGreaterEqThan(Integer countSt){
            this.countSt = countSt;
            return this;
        }
        public QueryBuilder countLessEqThan(Integer countEd){
            this.countEd = countEd;
            return this;
        }


        public QueryBuilder count(Integer count){
            setCount(count);
            return this;
        }

        public QueryBuilder countList(Integer ... count){
            this.countList = solveNullList(count);
            return this;
        }

        public QueryBuilder countList(List<Integer> count){
            this.countList = count;
            return this;
        }

        public QueryBuilder fetchCount(){
            setFetchFields("fetchFields","count");
            return this;
        }

        public QueryBuilder excludeCount(){
            setFetchFields("excludeFields","count");
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

        public GetCoinModel build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<Integer> user_idList;

        public List<Integer> getUser_idList(){return this.user_idList;}

        private Integer user_idSt;

        private Integer user_idEd;

        public Integer getUser_idSt(){return this.user_idSt;}

        public Integer getUser_idEd(){return this.user_idEd;}

        private List<java.time.LocalDateTime> timeList;

        public List<java.time.LocalDateTime> getTimeList(){return this.timeList;}

        private java.time.LocalDateTime timeSt;

        private java.time.LocalDateTime timeEd;

        public java.time.LocalDateTime getTimeSt(){return this.timeSt;}

        public java.time.LocalDateTime getTimeEd(){return this.timeEd;}

        private List<Integer> countList;

        public List<Integer> getCountList(){return this.countList;}

        private Integer countSt;

        private Integer countEd;

        public Integer getCountSt(){return this.countSt;}

        public Integer getCountEd(){return this.countEd;}


        public ConditionBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

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

        public ConditionBuilder countBetWeen(Integer countSt,Integer countEd){
            this.countSt = countSt;
            this.countEd = countEd;
            return this;
        }

        public ConditionBuilder countGreaterEqThan(Integer countSt){
            this.countSt = countSt;
            return this;
        }
        public ConditionBuilder countLessEqThan(Integer countEd){
            this.countEd = countEd;
            return this;
        }


        public ConditionBuilder countList(Integer ... count){
            this.countList = solveNullList(count);
            return this;
        }

        public ConditionBuilder countList(List<Integer> count){
            this.countList = count;
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

        private GetCoinModel obj;

        public Builder(){
            this.obj = new GetCoinModel();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder user_id(Integer user_id){
            this.obj.setUser_id(user_id);
            return this;
        }
        public Builder time(java.time.LocalDateTime time){
            this.obj.setTime(time);
            return this;
        }
        public Builder count(Integer count){
            this.obj.setCount(count);
            return this;
        }
        public GetCoinModel build(){return obj;}
    }

}
