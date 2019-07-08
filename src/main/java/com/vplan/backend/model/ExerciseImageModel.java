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
public class ExerciseImageModel implements Serializable {

    private static final long serialVersionUID = 1562150170868L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 名字
    * isNullAble:1
    */
    private String name;

    /**
    * 存放位置
    * isNullAble:1
    */
    private String location;

    /**
    * 对应题目id
    * isNullAble:1
    */
    private Integer exercise_id;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setLocation(String location){this.location = location;}

    public String getLocation(){return this.location;}

    public void setExercise_id(Integer exercise_id){this.exercise_id = exercise_id;}

    public Integer getExercise_id(){return this.exercise_id;}
    @Override
    public String toString() {
        return "ExerciseImageModel{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                "location='" + location + '\'' +
                "exercise_id='" + exercise_id + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private ExerciseImageModel set;

        private ConditionBuilder where;

        public UpdateBuilder set(ExerciseImageModel set){
            this.set = set;
            return this;
        }

        public ExerciseImageModel getSet(){
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

    public static class QueryBuilder extends ExerciseImageModel{
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

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<String> locationList;

        public List<String> getLocationList(){return this.locationList;}


        private List<String> fuzzyLocation;

        public List<String> getFuzzyLocation(){return this.fuzzyLocation;}

        private List<String> rightFuzzyLocation;

        public List<String> getRightFuzzyLocation(){return this.rightFuzzyLocation;}
        private List<Integer> exercise_idList;

        public List<Integer> getExercise_idList(){return this.exercise_idList;}

        private Integer exercise_idSt;

        private Integer exercise_idEd;

        public Integer getExercise_idSt(){return this.exercise_idSt;}

        public Integer getExercise_idEd(){return this.exercise_idEd;}

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

        public QueryBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public QueryBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public QueryBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public QueryBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public QueryBuilder name(String name){
            setName(name);
            return this;
        }

        public QueryBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public QueryBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public QueryBuilder fetchName(){
            setFetchFields("fetchFields","name");
            return this;
        }

        public QueryBuilder excludeName(){
            setFetchFields("excludeFields","name");
            return this;
        }

        public QueryBuilder fuzzyLocation (List<String> fuzzyLocation){
            this.fuzzyLocation = fuzzyLocation;
            return this;
        }

        public QueryBuilder fuzzyLocation (String ... fuzzyLocation){
            this.fuzzyLocation = solveNullList(fuzzyLocation);
            return this;
        }

        public QueryBuilder rightFuzzyLocation (List<String> rightFuzzyLocation){
            this.rightFuzzyLocation = rightFuzzyLocation;
            return this;
        }

        public QueryBuilder rightFuzzyLocation (String ... rightFuzzyLocation){
            this.rightFuzzyLocation = solveNullList(rightFuzzyLocation);
            return this;
        }

        public QueryBuilder location(String location){
            setLocation(location);
            return this;
        }

        public QueryBuilder locationList(String ... location){
            this.locationList = solveNullList(location);
            return this;
        }

        public QueryBuilder locationList(List<String> location){
            this.locationList = location;
            return this;
        }

        public QueryBuilder fetchLocation(){
            setFetchFields("fetchFields","location");
            return this;
        }

        public QueryBuilder excludeLocation(){
            setFetchFields("excludeFields","location");
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

        public ExerciseImageModel build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<String> locationList;

        public List<String> getLocationList(){return this.locationList;}


        private List<String> fuzzyLocation;

        public List<String> getFuzzyLocation(){return this.fuzzyLocation;}

        private List<String> rightFuzzyLocation;

        public List<String> getRightFuzzyLocation(){return this.rightFuzzyLocation;}
        private List<Integer> exercise_idList;

        public List<Integer> getExercise_idList(){return this.exercise_idList;}

        private Integer exercise_idSt;

        private Integer exercise_idEd;

        public Integer getExercise_idSt(){return this.exercise_idSt;}

        public Integer getExercise_idEd(){return this.exercise_idEd;}


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

        public ConditionBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public ConditionBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public ConditionBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public ConditionBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public ConditionBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public ConditionBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public ConditionBuilder fuzzyLocation (List<String> fuzzyLocation){
            this.fuzzyLocation = fuzzyLocation;
            return this;
        }

        public ConditionBuilder fuzzyLocation (String ... fuzzyLocation){
            this.fuzzyLocation = solveNullList(fuzzyLocation);
            return this;
        }

        public ConditionBuilder rightFuzzyLocation (List<String> rightFuzzyLocation){
            this.rightFuzzyLocation = rightFuzzyLocation;
            return this;
        }

        public ConditionBuilder rightFuzzyLocation (String ... rightFuzzyLocation){
            this.rightFuzzyLocation = solveNullList(rightFuzzyLocation);
            return this;
        }

        public ConditionBuilder locationList(String ... location){
            this.locationList = solveNullList(location);
            return this;
        }

        public ConditionBuilder locationList(List<String> location){
            this.locationList = location;
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

        private ExerciseImageModel obj;

        public Builder(){
            this.obj = new ExerciseImageModel();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder location(String location){
            this.obj.setLocation(location);
            return this;
        }
        public Builder exercise_id(Integer exercise_id){
            this.obj.setExercise_id(exercise_id);
            return this;
        }
        public ExerciseImageModel build(){return obj;}
    }

}
