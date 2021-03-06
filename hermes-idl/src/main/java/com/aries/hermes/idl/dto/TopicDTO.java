/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.aries.hermes.idl.dto;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-05-30")
public class TopicDTO implements org.apache.thrift.TBase<TopicDTO, TopicDTO._Fields>, java.io.Serializable, Cloneable, Comparable<TopicDTO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TopicDTO");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField THEME_FIELD_DESC = new org.apache.thrift.protocol.TField("theme", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CONTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("content", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField GAEA_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("gaeaId", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField ANONYMOUS_SEND_FIELD_DESC = new org.apache.thrift.protocol.TField("anonymousSend", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField ANONYMOUS_REPLY_FIELD_DESC = new org.apache.thrift.protocol.TField("anonymousReply", org.apache.thrift.protocol.TType.BOOL, (short)6);
  private static final org.apache.thrift.protocol.TField CATEGORY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("categoryId", org.apache.thrift.protocol.TType.I64, (short)7);
  private static final org.apache.thrift.protocol.TField UPDATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("updateTime", org.apache.thrift.protocol.TType.STRING, (short)8);
  private static final org.apache.thrift.protocol.TField INSERT_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("insertTime", org.apache.thrift.protocol.TType.STRING, (short)9);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TopicDTOStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TopicDTOTupleSchemeFactory();

  public long id; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String theme; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String content; // required
  public long gaeaId; // required
  public boolean anonymousSend; // required
  public boolean anonymousReply; // required
  public long categoryId; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String updateTime; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String insertTime; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    THEME((short)2, "theme"),
    CONTENT((short)3, "content"),
    GAEA_ID((short)4, "gaeaId"),
    ANONYMOUS_SEND((short)5, "anonymousSend"),
    ANONYMOUS_REPLY((short)6, "anonymousReply"),
    CATEGORY_ID((short)7, "categoryId"),
    UPDATE_TIME((short)8, "updateTime"),
    INSERT_TIME((short)9, "insertTime");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // THEME
          return THEME;
        case 3: // CONTENT
          return CONTENT;
        case 4: // GAEA_ID
          return GAEA_ID;
        case 5: // ANONYMOUS_SEND
          return ANONYMOUS_SEND;
        case 6: // ANONYMOUS_REPLY
          return ANONYMOUS_REPLY;
        case 7: // CATEGORY_ID
          return CATEGORY_ID;
        case 8: // UPDATE_TIME
          return UPDATE_TIME;
        case 9: // INSERT_TIME
          return INSERT_TIME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private static final int __GAEAID_ISSET_ID = 1;
  private static final int __ANONYMOUSSEND_ISSET_ID = 2;
  private static final int __ANONYMOUSREPLY_ISSET_ID = 3;
  private static final int __CATEGORYID_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.UPDATE_TIME,_Fields.INSERT_TIME};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.THEME, new org.apache.thrift.meta_data.FieldMetaData("theme", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONTENT, new org.apache.thrift.meta_data.FieldMetaData("content", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GAEA_ID, new org.apache.thrift.meta_data.FieldMetaData("gaeaId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ANONYMOUS_SEND, new org.apache.thrift.meta_data.FieldMetaData("anonymousSend", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ANONYMOUS_REPLY, new org.apache.thrift.meta_data.FieldMetaData("anonymousReply", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.CATEGORY_ID, new org.apache.thrift.meta_data.FieldMetaData("categoryId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.UPDATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("updateTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INSERT_TIME, new org.apache.thrift.meta_data.FieldMetaData("insertTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TopicDTO.class, metaDataMap);
  }

  public TopicDTO() {
  }

  public TopicDTO(
    long id,
    java.lang.String theme,
    java.lang.String content,
    long gaeaId,
    boolean anonymousSend,
    boolean anonymousReply,
    long categoryId)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.theme = theme;
    this.content = content;
    this.gaeaId = gaeaId;
    setGaeaIdIsSet(true);
    this.anonymousSend = anonymousSend;
    setAnonymousSendIsSet(true);
    this.anonymousReply = anonymousReply;
    setAnonymousReplyIsSet(true);
    this.categoryId = categoryId;
    setCategoryIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TopicDTO(TopicDTO other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetTheme()) {
      this.theme = other.theme;
    }
    if (other.isSetContent()) {
      this.content = other.content;
    }
    this.gaeaId = other.gaeaId;
    this.anonymousSend = other.anonymousSend;
    this.anonymousReply = other.anonymousReply;
    this.categoryId = other.categoryId;
    if (other.isSetUpdateTime()) {
      this.updateTime = other.updateTime;
    }
    if (other.isSetInsertTime()) {
      this.insertTime = other.insertTime;
    }
  }

  public TopicDTO deepCopy() {
    return new TopicDTO(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.theme = null;
    this.content = null;
    setGaeaIdIsSet(false);
    this.gaeaId = 0;
    setAnonymousSendIsSet(false);
    this.anonymousSend = false;
    setAnonymousReplyIsSet(false);
    this.anonymousReply = false;
    setCategoryIdIsSet(false);
    this.categoryId = 0;
    this.updateTime = null;
    this.insertTime = null;
  }

  public long getId() {
    return this.id;
  }

  public TopicDTO setId(long id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTheme() {
    return this.theme;
  }

  public TopicDTO setTheme(@org.apache.thrift.annotation.Nullable java.lang.String theme) {
    this.theme = theme;
    return this;
  }

  public void unsetTheme() {
    this.theme = null;
  }

  /** Returns true if field theme is set (has been assigned a value) and false otherwise */
  public boolean isSetTheme() {
    return this.theme != null;
  }

  public void setThemeIsSet(boolean value) {
    if (!value) {
      this.theme = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getContent() {
    return this.content;
  }

  public TopicDTO setContent(@org.apache.thrift.annotation.Nullable java.lang.String content) {
    this.content = content;
    return this;
  }

  public void unsetContent() {
    this.content = null;
  }

  /** Returns true if field content is set (has been assigned a value) and false otherwise */
  public boolean isSetContent() {
    return this.content != null;
  }

  public void setContentIsSet(boolean value) {
    if (!value) {
      this.content = null;
    }
  }

  public long getGaeaId() {
    return this.gaeaId;
  }

  public TopicDTO setGaeaId(long gaeaId) {
    this.gaeaId = gaeaId;
    setGaeaIdIsSet(true);
    return this;
  }

  public void unsetGaeaId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __GAEAID_ISSET_ID);
  }

  /** Returns true if field gaeaId is set (has been assigned a value) and false otherwise */
  public boolean isSetGaeaId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __GAEAID_ISSET_ID);
  }

  public void setGaeaIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __GAEAID_ISSET_ID, value);
  }

  public boolean isAnonymousSend() {
    return this.anonymousSend;
  }

  public TopicDTO setAnonymousSend(boolean anonymousSend) {
    this.anonymousSend = anonymousSend;
    setAnonymousSendIsSet(true);
    return this;
  }

  public void unsetAnonymousSend() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ANONYMOUSSEND_ISSET_ID);
  }

  /** Returns true if field anonymousSend is set (has been assigned a value) and false otherwise */
  public boolean isSetAnonymousSend() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ANONYMOUSSEND_ISSET_ID);
  }

  public void setAnonymousSendIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ANONYMOUSSEND_ISSET_ID, value);
  }

  public boolean isAnonymousReply() {
    return this.anonymousReply;
  }

  public TopicDTO setAnonymousReply(boolean anonymousReply) {
    this.anonymousReply = anonymousReply;
    setAnonymousReplyIsSet(true);
    return this;
  }

  public void unsetAnonymousReply() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ANONYMOUSREPLY_ISSET_ID);
  }

  /** Returns true if field anonymousReply is set (has been assigned a value) and false otherwise */
  public boolean isSetAnonymousReply() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ANONYMOUSREPLY_ISSET_ID);
  }

  public void setAnonymousReplyIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ANONYMOUSREPLY_ISSET_ID, value);
  }

  public long getCategoryId() {
    return this.categoryId;
  }

  public TopicDTO setCategoryId(long categoryId) {
    this.categoryId = categoryId;
    setCategoryIdIsSet(true);
    return this;
  }

  public void unsetCategoryId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CATEGORYID_ISSET_ID);
  }

  /** Returns true if field categoryId is set (has been assigned a value) and false otherwise */
  public boolean isSetCategoryId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CATEGORYID_ISSET_ID);
  }

  public void setCategoryIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CATEGORYID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getUpdateTime() {
    return this.updateTime;
  }

  public TopicDTO setUpdateTime(@org.apache.thrift.annotation.Nullable java.lang.String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public void unsetUpdateTime() {
    this.updateTime = null;
  }

  /** Returns true if field updateTime is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdateTime() {
    return this.updateTime != null;
  }

  public void setUpdateTimeIsSet(boolean value) {
    if (!value) {
      this.updateTime = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getInsertTime() {
    return this.insertTime;
  }

  public TopicDTO setInsertTime(@org.apache.thrift.annotation.Nullable java.lang.String insertTime) {
    this.insertTime = insertTime;
    return this;
  }

  public void unsetInsertTime() {
    this.insertTime = null;
  }

  /** Returns true if field insertTime is set (has been assigned a value) and false otherwise */
  public boolean isSetInsertTime() {
    return this.insertTime != null;
  }

  public void setInsertTimeIsSet(boolean value) {
    if (!value) {
      this.insertTime = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.Long)value);
      }
      break;

    case THEME:
      if (value == null) {
        unsetTheme();
      } else {
        setTheme((java.lang.String)value);
      }
      break;

    case CONTENT:
      if (value == null) {
        unsetContent();
      } else {
        setContent((java.lang.String)value);
      }
      break;

    case GAEA_ID:
      if (value == null) {
        unsetGaeaId();
      } else {
        setGaeaId((java.lang.Long)value);
      }
      break;

    case ANONYMOUS_SEND:
      if (value == null) {
        unsetAnonymousSend();
      } else {
        setAnonymousSend((java.lang.Boolean)value);
      }
      break;

    case ANONYMOUS_REPLY:
      if (value == null) {
        unsetAnonymousReply();
      } else {
        setAnonymousReply((java.lang.Boolean)value);
      }
      break;

    case CATEGORY_ID:
      if (value == null) {
        unsetCategoryId();
      } else {
        setCategoryId((java.lang.Long)value);
      }
      break;

    case UPDATE_TIME:
      if (value == null) {
        unsetUpdateTime();
      } else {
        setUpdateTime((java.lang.String)value);
      }
      break;

    case INSERT_TIME:
      if (value == null) {
        unsetInsertTime();
      } else {
        setInsertTime((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case THEME:
      return getTheme();

    case CONTENT:
      return getContent();

    case GAEA_ID:
      return getGaeaId();

    case ANONYMOUS_SEND:
      return isAnonymousSend();

    case ANONYMOUS_REPLY:
      return isAnonymousReply();

    case CATEGORY_ID:
      return getCategoryId();

    case UPDATE_TIME:
      return getUpdateTime();

    case INSERT_TIME:
      return getInsertTime();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case THEME:
      return isSetTheme();
    case CONTENT:
      return isSetContent();
    case GAEA_ID:
      return isSetGaeaId();
    case ANONYMOUS_SEND:
      return isSetAnonymousSend();
    case ANONYMOUS_REPLY:
      return isSetAnonymousReply();
    case CATEGORY_ID:
      return isSetCategoryId();
    case UPDATE_TIME:
      return isSetUpdateTime();
    case INSERT_TIME:
      return isSetInsertTime();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TopicDTO)
      return this.equals((TopicDTO)that);
    return false;
  }

  public boolean equals(TopicDTO that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_theme = true && this.isSetTheme();
    boolean that_present_theme = true && that.isSetTheme();
    if (this_present_theme || that_present_theme) {
      if (!(this_present_theme && that_present_theme))
        return false;
      if (!this.theme.equals(that.theme))
        return false;
    }

    boolean this_present_content = true && this.isSetContent();
    boolean that_present_content = true && that.isSetContent();
    if (this_present_content || that_present_content) {
      if (!(this_present_content && that_present_content))
        return false;
      if (!this.content.equals(that.content))
        return false;
    }

    boolean this_present_gaeaId = true;
    boolean that_present_gaeaId = true;
    if (this_present_gaeaId || that_present_gaeaId) {
      if (!(this_present_gaeaId && that_present_gaeaId))
        return false;
      if (this.gaeaId != that.gaeaId)
        return false;
    }

    boolean this_present_anonymousSend = true;
    boolean that_present_anonymousSend = true;
    if (this_present_anonymousSend || that_present_anonymousSend) {
      if (!(this_present_anonymousSend && that_present_anonymousSend))
        return false;
      if (this.anonymousSend != that.anonymousSend)
        return false;
    }

    boolean this_present_anonymousReply = true;
    boolean that_present_anonymousReply = true;
    if (this_present_anonymousReply || that_present_anonymousReply) {
      if (!(this_present_anonymousReply && that_present_anonymousReply))
        return false;
      if (this.anonymousReply != that.anonymousReply)
        return false;
    }

    boolean this_present_categoryId = true;
    boolean that_present_categoryId = true;
    if (this_present_categoryId || that_present_categoryId) {
      if (!(this_present_categoryId && that_present_categoryId))
        return false;
      if (this.categoryId != that.categoryId)
        return false;
    }

    boolean this_present_updateTime = true && this.isSetUpdateTime();
    boolean that_present_updateTime = true && that.isSetUpdateTime();
    if (this_present_updateTime || that_present_updateTime) {
      if (!(this_present_updateTime && that_present_updateTime))
        return false;
      if (!this.updateTime.equals(that.updateTime))
        return false;
    }

    boolean this_present_insertTime = true && this.isSetInsertTime();
    boolean that_present_insertTime = true && that.isSetInsertTime();
    if (this_present_insertTime || that_present_insertTime) {
      if (!(this_present_insertTime && that_present_insertTime))
        return false;
      if (!this.insertTime.equals(that.insertTime))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(id);

    hashCode = hashCode * 8191 + ((isSetTheme()) ? 131071 : 524287);
    if (isSetTheme())
      hashCode = hashCode * 8191 + theme.hashCode();

    hashCode = hashCode * 8191 + ((isSetContent()) ? 131071 : 524287);
    if (isSetContent())
      hashCode = hashCode * 8191 + content.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(gaeaId);

    hashCode = hashCode * 8191 + ((anonymousSend) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((anonymousReply) ? 131071 : 524287);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(categoryId);

    hashCode = hashCode * 8191 + ((isSetUpdateTime()) ? 131071 : 524287);
    if (isSetUpdateTime())
      hashCode = hashCode * 8191 + updateTime.hashCode();

    hashCode = hashCode * 8191 + ((isSetInsertTime()) ? 131071 : 524287);
    if (isSetInsertTime())
      hashCode = hashCode * 8191 + insertTime.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TopicDTO other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTheme()).compareTo(other.isSetTheme());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTheme()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.theme, other.theme);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetContent()).compareTo(other.isSetContent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.content, other.content);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetGaeaId()).compareTo(other.isSetGaeaId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGaeaId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gaeaId, other.gaeaId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAnonymousSend()).compareTo(other.isSetAnonymousSend());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAnonymousSend()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.anonymousSend, other.anonymousSend);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAnonymousReply()).compareTo(other.isSetAnonymousReply());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAnonymousReply()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.anonymousReply, other.anonymousReply);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCategoryId()).compareTo(other.isSetCategoryId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCategoryId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.categoryId, other.categoryId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUpdateTime()).compareTo(other.isSetUpdateTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdateTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updateTime, other.updateTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetInsertTime()).compareTo(other.isSetInsertTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInsertTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.insertTime, other.insertTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TopicDTO(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("theme:");
    if (this.theme == null) {
      sb.append("null");
    } else {
      sb.append(this.theme);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("content:");
    if (this.content == null) {
      sb.append("null");
    } else {
      sb.append(this.content);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("gaeaId:");
    sb.append(this.gaeaId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("anonymousSend:");
    sb.append(this.anonymousSend);
    first = false;
    if (!first) sb.append(", ");
    sb.append("anonymousReply:");
    sb.append(this.anonymousReply);
    first = false;
    if (!first) sb.append(", ");
    sb.append("categoryId:");
    sb.append(this.categoryId);
    first = false;
    if (isSetUpdateTime()) {
      if (!first) sb.append(", ");
      sb.append("updateTime:");
      if (this.updateTime == null) {
        sb.append("null");
      } else {
        sb.append(this.updateTime);
      }
      first = false;
    }
    if (isSetInsertTime()) {
      if (!first) sb.append(", ");
      sb.append("insertTime:");
      if (this.insertTime == null) {
        sb.append("null");
      } else {
        sb.append(this.insertTime);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TopicDTOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TopicDTOStandardScheme getScheme() {
      return new TopicDTOStandardScheme();
    }
  }

  private static class TopicDTOStandardScheme extends org.apache.thrift.scheme.StandardScheme<TopicDTO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TopicDTO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.id = iprot.readI64();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // THEME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.theme = iprot.readString();
              struct.setThemeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONTENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.content = iprot.readString();
              struct.setContentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // GAEA_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.gaeaId = iprot.readI64();
              struct.setGaeaIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ANONYMOUS_SEND
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.anonymousSend = iprot.readBool();
              struct.setAnonymousSendIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ANONYMOUS_REPLY
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.anonymousReply = iprot.readBool();
              struct.setAnonymousReplyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // CATEGORY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.categoryId = iprot.readI64();
              struct.setCategoryIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // UPDATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.updateTime = iprot.readString();
              struct.setUpdateTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // INSERT_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.insertTime = iprot.readString();
              struct.setInsertTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TopicDTO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI64(struct.id);
      oprot.writeFieldEnd();
      if (struct.theme != null) {
        oprot.writeFieldBegin(THEME_FIELD_DESC);
        oprot.writeString(struct.theme);
        oprot.writeFieldEnd();
      }
      if (struct.content != null) {
        oprot.writeFieldBegin(CONTENT_FIELD_DESC);
        oprot.writeString(struct.content);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(GAEA_ID_FIELD_DESC);
      oprot.writeI64(struct.gaeaId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ANONYMOUS_SEND_FIELD_DESC);
      oprot.writeBool(struct.anonymousSend);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ANONYMOUS_REPLY_FIELD_DESC);
      oprot.writeBool(struct.anonymousReply);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CATEGORY_ID_FIELD_DESC);
      oprot.writeI64(struct.categoryId);
      oprot.writeFieldEnd();
      if (struct.updateTime != null) {
        if (struct.isSetUpdateTime()) {
          oprot.writeFieldBegin(UPDATE_TIME_FIELD_DESC);
          oprot.writeString(struct.updateTime);
          oprot.writeFieldEnd();
        }
      }
      if (struct.insertTime != null) {
        if (struct.isSetInsertTime()) {
          oprot.writeFieldBegin(INSERT_TIME_FIELD_DESC);
          oprot.writeString(struct.insertTime);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TopicDTOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TopicDTOTupleScheme getScheme() {
      return new TopicDTOTupleScheme();
    }
  }

  private static class TopicDTOTupleScheme extends org.apache.thrift.scheme.TupleScheme<TopicDTO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TopicDTO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetTheme()) {
        optionals.set(1);
      }
      if (struct.isSetContent()) {
        optionals.set(2);
      }
      if (struct.isSetGaeaId()) {
        optionals.set(3);
      }
      if (struct.isSetAnonymousSend()) {
        optionals.set(4);
      }
      if (struct.isSetAnonymousReply()) {
        optionals.set(5);
      }
      if (struct.isSetCategoryId()) {
        optionals.set(6);
      }
      if (struct.isSetUpdateTime()) {
        optionals.set(7);
      }
      if (struct.isSetInsertTime()) {
        optionals.set(8);
      }
      oprot.writeBitSet(optionals, 9);
      if (struct.isSetId()) {
        oprot.writeI64(struct.id);
      }
      if (struct.isSetTheme()) {
        oprot.writeString(struct.theme);
      }
      if (struct.isSetContent()) {
        oprot.writeString(struct.content);
      }
      if (struct.isSetGaeaId()) {
        oprot.writeI64(struct.gaeaId);
      }
      if (struct.isSetAnonymousSend()) {
        oprot.writeBool(struct.anonymousSend);
      }
      if (struct.isSetAnonymousReply()) {
        oprot.writeBool(struct.anonymousReply);
      }
      if (struct.isSetCategoryId()) {
        oprot.writeI64(struct.categoryId);
      }
      if (struct.isSetUpdateTime()) {
        oprot.writeString(struct.updateTime);
      }
      if (struct.isSetInsertTime()) {
        oprot.writeString(struct.insertTime);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TopicDTO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(9);
      if (incoming.get(0)) {
        struct.id = iprot.readI64();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.theme = iprot.readString();
        struct.setThemeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.content = iprot.readString();
        struct.setContentIsSet(true);
      }
      if (incoming.get(3)) {
        struct.gaeaId = iprot.readI64();
        struct.setGaeaIdIsSet(true);
      }
      if (incoming.get(4)) {
        struct.anonymousSend = iprot.readBool();
        struct.setAnonymousSendIsSet(true);
      }
      if (incoming.get(5)) {
        struct.anonymousReply = iprot.readBool();
        struct.setAnonymousReplyIsSet(true);
      }
      if (incoming.get(6)) {
        struct.categoryId = iprot.readI64();
        struct.setCategoryIdIsSet(true);
      }
      if (incoming.get(7)) {
        struct.updateTime = iprot.readString();
        struct.setUpdateTimeIsSet(true);
      }
      if (incoming.get(8)) {
        struct.insertTime = iprot.readString();
        struct.setInsertTimeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

