package com.taotao.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserTxIsNull() {
            addCriterion("user_tx is null");
            return (Criteria) this;
        }

        public Criteria andUserTxIsNotNull() {
            addCriterion("user_tx is not null");
            return (Criteria) this;
        }

        public Criteria andUserTxEqualTo(String value) {
            addCriterion("user_tx =", value, "userTx");
            return (Criteria) this;
        }

        public Criteria andUserTxNotEqualTo(String value) {
            addCriterion("user_tx <>", value, "userTx");
            return (Criteria) this;
        }

        public Criteria andUserTxGreaterThan(String value) {
            addCriterion("user_tx >", value, "userTx");
            return (Criteria) this;
        }

        public Criteria andUserTxGreaterThanOrEqualTo(String value) {
            addCriterion("user_tx >=", value, "userTx");
            return (Criteria) this;
        }

        public Criteria andUserTxLessThan(String value) {
            addCriterion("user_tx <", value, "userTx");
            return (Criteria) this;
        }

        public Criteria andUserTxLessThanOrEqualTo(String value) {
            addCriterion("user_tx <=", value, "userTx");
            return (Criteria) this;
        }

        public Criteria andUserTxLike(String value) {
            addCriterion("user_tx like", value, "userTx");
            return (Criteria) this;
        }

        public Criteria andUserTxNotLike(String value) {
            addCriterion("user_tx not like", value, "userTx");
            return (Criteria) this;
        }

        public Criteria andUserTxIn(List<String> values) {
            addCriterion("user_tx in", values, "userTx");
            return (Criteria) this;
        }

        public Criteria andUserTxNotIn(List<String> values) {
            addCriterion("user_tx not in", values, "userTx");
            return (Criteria) this;
        }

        public Criteria andUserTxBetween(String value1, String value2) {
            addCriterion("user_tx between", value1, value2, "userTx");
            return (Criteria) this;
        }

        public Criteria andUserTxNotBetween(String value1, String value2) {
            addCriterion("user_tx not between", value1, value2, "userTx");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserZsnameIsNull() {
            addCriterion("user_zsname is null");
            return (Criteria) this;
        }

        public Criteria andUserZsnameIsNotNull() {
            addCriterion("user_zsname is not null");
            return (Criteria) this;
        }

        public Criteria andUserZsnameEqualTo(String value) {
            addCriterion("user_zsname =", value, "userZsname");
            return (Criteria) this;
        }

        public Criteria andUserZsnameNotEqualTo(String value) {
            addCriterion("user_zsname <>", value, "userZsname");
            return (Criteria) this;
        }

        public Criteria andUserZsnameGreaterThan(String value) {
            addCriterion("user_zsname >", value, "userZsname");
            return (Criteria) this;
        }

        public Criteria andUserZsnameGreaterThanOrEqualTo(String value) {
            addCriterion("user_zsname >=", value, "userZsname");
            return (Criteria) this;
        }

        public Criteria andUserZsnameLessThan(String value) {
            addCriterion("user_zsname <", value, "userZsname");
            return (Criteria) this;
        }

        public Criteria andUserZsnameLessThanOrEqualTo(String value) {
            addCriterion("user_zsname <=", value, "userZsname");
            return (Criteria) this;
        }

        public Criteria andUserZsnameLike(String value) {
            addCriterion("user_zsname like", value, "userZsname");
            return (Criteria) this;
        }

        public Criteria andUserZsnameNotLike(String value) {
            addCriterion("user_zsname not like", value, "userZsname");
            return (Criteria) this;
        }

        public Criteria andUserZsnameIn(List<String> values) {
            addCriterion("user_zsname in", values, "userZsname");
            return (Criteria) this;
        }

        public Criteria andUserZsnameNotIn(List<String> values) {
            addCriterion("user_zsname not in", values, "userZsname");
            return (Criteria) this;
        }

        public Criteria andUserZsnameBetween(String value1, String value2) {
            addCriterion("user_zsname between", value1, value2, "userZsname");
            return (Criteria) this;
        }

        public Criteria andUserZsnameNotBetween(String value1, String value2) {
            addCriterion("user_zsname not between", value1, value2, "userZsname");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(Byte value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(Byte value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(Byte value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(Byte value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(Byte value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<Byte> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<Byte> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(Byte value1, Byte value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(Byte value1, Byte value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNull() {
            addCriterion("user_birthday is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNotNull() {
            addCriterion("user_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayEqualTo(Date value) {
            addCriterion("user_birthday =", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotEqualTo(Date value) {
            addCriterion("user_birthday <>", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThan(Date value) {
            addCriterion("user_birthday >", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("user_birthday >=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThan(Date value) {
            addCriterion("user_birthday <", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("user_birthday <=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIn(List<Date> values) {
            addCriterion("user_birthday in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotIn(List<Date> values) {
            addCriterion("user_birthday not in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayBetween(Date value1, Date value2) {
            addCriterion("user_birthday between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("user_birthday not between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("user_address is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("user_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("user_address =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("user_address <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("user_address >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_address >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("user_address <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("user_address <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("user_address like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("user_address not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("user_address in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("user_address not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("user_address between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("user_address not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserQqIsNull() {
            addCriterion("user_qq is null");
            return (Criteria) this;
        }

        public Criteria andUserQqIsNotNull() {
            addCriterion("user_qq is not null");
            return (Criteria) this;
        }

        public Criteria andUserQqEqualTo(Integer value) {
            addCriterion("user_qq =", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotEqualTo(Integer value) {
            addCriterion("user_qq <>", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqGreaterThan(Integer value) {
            addCriterion("user_qq >", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_qq >=", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqLessThan(Integer value) {
            addCriterion("user_qq <", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqLessThanOrEqualTo(Integer value) {
            addCriterion("user_qq <=", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqIn(List<Integer> values) {
            addCriterion("user_qq in", values, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotIn(List<Integer> values) {
            addCriterion("user_qq not in", values, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqBetween(Integer value1, Integer value2) {
            addCriterion("user_qq between", value1, value2, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotBetween(Integer value1, Integer value2) {
            addCriterion("user_qq not between", value1, value2, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserAliliIsNull() {
            addCriterion("user_alili is null");
            return (Criteria) this;
        }

        public Criteria andUserAliliIsNotNull() {
            addCriterion("user_alili is not null");
            return (Criteria) this;
        }

        public Criteria andUserAliliEqualTo(String value) {
            addCriterion("user_alili =", value, "userAlili");
            return (Criteria) this;
        }

        public Criteria andUserAliliNotEqualTo(String value) {
            addCriterion("user_alili <>", value, "userAlili");
            return (Criteria) this;
        }

        public Criteria andUserAliliGreaterThan(String value) {
            addCriterion("user_alili >", value, "userAlili");
            return (Criteria) this;
        }

        public Criteria andUserAliliGreaterThanOrEqualTo(String value) {
            addCriterion("user_alili >=", value, "userAlili");
            return (Criteria) this;
        }

        public Criteria andUserAliliLessThan(String value) {
            addCriterion("user_alili <", value, "userAlili");
            return (Criteria) this;
        }

        public Criteria andUserAliliLessThanOrEqualTo(String value) {
            addCriterion("user_alili <=", value, "userAlili");
            return (Criteria) this;
        }

        public Criteria andUserAliliLike(String value) {
            addCriterion("user_alili like", value, "userAlili");
            return (Criteria) this;
        }

        public Criteria andUserAliliNotLike(String value) {
            addCriterion("user_alili not like", value, "userAlili");
            return (Criteria) this;
        }

        public Criteria andUserAliliIn(List<String> values) {
            addCriterion("user_alili in", values, "userAlili");
            return (Criteria) this;
        }

        public Criteria andUserAliliNotIn(List<String> values) {
            addCriterion("user_alili not in", values, "userAlili");
            return (Criteria) this;
        }

        public Criteria andUserAliliBetween(String value1, String value2) {
            addCriterion("user_alili between", value1, value2, "userAlili");
            return (Criteria) this;
        }

        public Criteria andUserAliliNotBetween(String value1, String value2) {
            addCriterion("user_alili not between", value1, value2, "userAlili");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNull() {
            addCriterion("user_state is null");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNotNull() {
            addCriterion("user_state is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateEqualTo(Integer value) {
            addCriterion("user_state =", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotEqualTo(Integer value) {
            addCriterion("user_state <>", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThan(Integer value) {
            addCriterion("user_state >", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_state >=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThan(Integer value) {
            addCriterion("user_state <", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThanOrEqualTo(Integer value) {
            addCriterion("user_state <=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateIn(List<Integer> values) {
            addCriterion("user_state in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotIn(List<Integer> values) {
            addCriterion("user_state not in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateBetween(Integer value1, Integer value2) {
            addCriterion("user_state between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotBetween(Integer value1, Integer value2) {
            addCriterion("user_state not between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserCreatedIsNull() {
            addCriterion("user_created is null");
            return (Criteria) this;
        }

        public Criteria andUserCreatedIsNotNull() {
            addCriterion("user_created is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreatedEqualTo(Date value) {
            addCriterion("user_created =", value, "userCreated");
            return (Criteria) this;
        }

        public Criteria andUserCreatedNotEqualTo(Date value) {
            addCriterion("user_created <>", value, "userCreated");
            return (Criteria) this;
        }

        public Criteria andUserCreatedGreaterThan(Date value) {
            addCriterion("user_created >", value, "userCreated");
            return (Criteria) this;
        }

        public Criteria andUserCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("user_created >=", value, "userCreated");
            return (Criteria) this;
        }

        public Criteria andUserCreatedLessThan(Date value) {
            addCriterion("user_created <", value, "userCreated");
            return (Criteria) this;
        }

        public Criteria andUserCreatedLessThanOrEqualTo(Date value) {
            addCriterion("user_created <=", value, "userCreated");
            return (Criteria) this;
        }

        public Criteria andUserCreatedIn(List<Date> values) {
            addCriterion("user_created in", values, "userCreated");
            return (Criteria) this;
        }

        public Criteria andUserCreatedNotIn(List<Date> values) {
            addCriterion("user_created not in", values, "userCreated");
            return (Criteria) this;
        }

        public Criteria andUserCreatedBetween(Date value1, Date value2) {
            addCriterion("user_created between", value1, value2, "userCreated");
            return (Criteria) this;
        }

        public Criteria andUserCreatedNotBetween(Date value1, Date value2) {
            addCriterion("user_created not between", value1, value2, "userCreated");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedIsNull() {
            addCriterion("user_updated is null");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedIsNotNull() {
            addCriterion("user_updated is not null");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedEqualTo(Date value) {
            addCriterion("user_updated =", value, "userUpdated");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedNotEqualTo(Date value) {
            addCriterion("user_updated <>", value, "userUpdated");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedGreaterThan(Date value) {
            addCriterion("user_updated >", value, "userUpdated");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("user_updated >=", value, "userUpdated");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedLessThan(Date value) {
            addCriterion("user_updated <", value, "userUpdated");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("user_updated <=", value, "userUpdated");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedIn(List<Date> values) {
            addCriterion("user_updated in", values, "userUpdated");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedNotIn(List<Date> values) {
            addCriterion("user_updated not in", values, "userUpdated");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedBetween(Date value1, Date value2) {
            addCriterion("user_updated between", value1, value2, "userUpdated");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("user_updated not between", value1, value2, "userUpdated");
            return (Criteria) this;
        }

        public Criteria andUserYlIsNull() {
            addCriterion("user_yl is null");
            return (Criteria) this;
        }

        public Criteria andUserYlIsNotNull() {
            addCriterion("user_yl is not null");
            return (Criteria) this;
        }

        public Criteria andUserYlEqualTo(String value) {
            addCriterion("user_yl =", value, "userYl");
            return (Criteria) this;
        }

        public Criteria andUserYlNotEqualTo(String value) {
            addCriterion("user_yl <>", value, "userYl");
            return (Criteria) this;
        }

        public Criteria andUserYlGreaterThan(String value) {
            addCriterion("user_yl >", value, "userYl");
            return (Criteria) this;
        }

        public Criteria andUserYlGreaterThanOrEqualTo(String value) {
            addCriterion("user_yl >=", value, "userYl");
            return (Criteria) this;
        }

        public Criteria andUserYlLessThan(String value) {
            addCriterion("user_yl <", value, "userYl");
            return (Criteria) this;
        }

        public Criteria andUserYlLessThanOrEqualTo(String value) {
            addCriterion("user_yl <=", value, "userYl");
            return (Criteria) this;
        }

        public Criteria andUserYlLike(String value) {
            addCriterion("user_yl like", value, "userYl");
            return (Criteria) this;
        }

        public Criteria andUserYlNotLike(String value) {
            addCriterion("user_yl not like", value, "userYl");
            return (Criteria) this;
        }

        public Criteria andUserYlIn(List<String> values) {
            addCriterion("user_yl in", values, "userYl");
            return (Criteria) this;
        }

        public Criteria andUserYlNotIn(List<String> values) {
            addCriterion("user_yl not in", values, "userYl");
            return (Criteria) this;
        }

        public Criteria andUserYlBetween(String value1, String value2) {
            addCriterion("user_yl between", value1, value2, "userYl");
            return (Criteria) this;
        }

        public Criteria andUserYlNotBetween(String value1, String value2) {
            addCriterion("user_yl not between", value1, value2, "userYl");
            return (Criteria) this;
        }

        public Criteria andUserZjIsNull() {
            addCriterion("user_zj is null");
            return (Criteria) this;
        }

        public Criteria andUserZjIsNotNull() {
            addCriterion("user_zj is not null");
            return (Criteria) this;
        }

        public Criteria andUserZjEqualTo(String value) {
            addCriterion("user_zj =", value, "userZj");
            return (Criteria) this;
        }

        public Criteria andUserZjNotEqualTo(String value) {
            addCriterion("user_zj <>", value, "userZj");
            return (Criteria) this;
        }

        public Criteria andUserZjGreaterThan(String value) {
            addCriterion("user_zj >", value, "userZj");
            return (Criteria) this;
        }

        public Criteria andUserZjGreaterThanOrEqualTo(String value) {
            addCriterion("user_zj >=", value, "userZj");
            return (Criteria) this;
        }

        public Criteria andUserZjLessThan(String value) {
            addCriterion("user_zj <", value, "userZj");
            return (Criteria) this;
        }

        public Criteria andUserZjLessThanOrEqualTo(String value) {
            addCriterion("user_zj <=", value, "userZj");
            return (Criteria) this;
        }

        public Criteria andUserZjLike(String value) {
            addCriterion("user_zj like", value, "userZj");
            return (Criteria) this;
        }

        public Criteria andUserZjNotLike(String value) {
            addCriterion("user_zj not like", value, "userZj");
            return (Criteria) this;
        }

        public Criteria andUserZjIn(List<String> values) {
            addCriterion("user_zj in", values, "userZj");
            return (Criteria) this;
        }

        public Criteria andUserZjNotIn(List<String> values) {
            addCriterion("user_zj not in", values, "userZj");
            return (Criteria) this;
        }

        public Criteria andUserZjBetween(String value1, String value2) {
            addCriterion("user_zj between", value1, value2, "userZj");
            return (Criteria) this;
        }

        public Criteria andUserZjNotBetween(String value1, String value2) {
            addCriterion("user_zj not between", value1, value2, "userZj");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}