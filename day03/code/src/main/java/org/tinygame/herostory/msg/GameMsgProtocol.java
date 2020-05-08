package org.tinygame.herostory.msg;

public final class GameMsgProtocol {
  private GameMsgProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * 消息代号
   * </pre>
   *
   * Protobuf enum {@code msg.MsgCode}
   */
  public enum MsgCode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>USER_ENTRY_CMD = 0;</code>
     */
    USER_ENTRY_CMD(0),
    /**
     * <code>USER_ENTRY_RESULT = 1;</code>
     */
    USER_ENTRY_RESULT(1),
    /**
     * <code>WHO_ELSE_IS_HERE_CMD = 2;</code>
     */
    WHO_ELSE_IS_HERE_CMD(2),
    /**
     * <code>WHO_ELSE_IS_HERE_RESULT = 3;</code>
     */
    WHO_ELSE_IS_HERE_RESULT(3),
    /**
     * <code>USER_MOVE_TO_CMD = 4;</code>
     */
    USER_MOVE_TO_CMD(4),
    /**
     * <code>USER_MOVE_TO_RESULT = 5;</code>
     */
    USER_MOVE_TO_RESULT(5),
    /**
     * <code>USER_QUIT_RESULT = 6;</code>
     */
    USER_QUIT_RESULT(6),
    /**
     * <code>USER_STOP_CMD = 7;</code>
     */
    USER_STOP_CMD(7),
    /**
     * <code>USER_STOP_RESULT = 8;</code>
     */
    USER_STOP_RESULT(8),
    /**
     * <code>USER_ATTK_CMD = 9;</code>
     */
    USER_ATTK_CMD(9),
    /**
     * <code>USER_ATTK_RESULT = 10;</code>
     */
    USER_ATTK_RESULT(10),
    /**
     * <code>USER_SUBTRACT_HP_RESULT = 11;</code>
     */
    USER_SUBTRACT_HP_RESULT(11),
    /**
     * <code>USER_DIE_RESULT = 12;</code>
     */
    USER_DIE_RESULT(12),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>USER_ENTRY_CMD = 0;</code>
     */
    public static final int USER_ENTRY_CMD_VALUE = 0;
    /**
     * <code>USER_ENTRY_RESULT = 1;</code>
     */
    public static final int USER_ENTRY_RESULT_VALUE = 1;
    /**
     * <code>WHO_ELSE_IS_HERE_CMD = 2;</code>
     */
    public static final int WHO_ELSE_IS_HERE_CMD_VALUE = 2;
    /**
     * <code>WHO_ELSE_IS_HERE_RESULT = 3;</code>
     */
    public static final int WHO_ELSE_IS_HERE_RESULT_VALUE = 3;
    /**
     * <code>USER_MOVE_TO_CMD = 4;</code>
     */
    public static final int USER_MOVE_TO_CMD_VALUE = 4;
    /**
     * <code>USER_MOVE_TO_RESULT = 5;</code>
     */
    public static final int USER_MOVE_TO_RESULT_VALUE = 5;
    /**
     * <code>USER_QUIT_RESULT = 6;</code>
     */
    public static final int USER_QUIT_RESULT_VALUE = 6;
    /**
     * <code>USER_STOP_CMD = 7;</code>
     */
    public static final int USER_STOP_CMD_VALUE = 7;
    /**
     * <code>USER_STOP_RESULT = 8;</code>
     */
    public static final int USER_STOP_RESULT_VALUE = 8;
    /**
     * <code>USER_ATTK_CMD = 9;</code>
     */
    public static final int USER_ATTK_CMD_VALUE = 9;
    /**
     * <code>USER_ATTK_RESULT = 10;</code>
     */
    public static final int USER_ATTK_RESULT_VALUE = 10;
    /**
     * <code>USER_SUBTRACT_HP_RESULT = 11;</code>
     */
    public static final int USER_SUBTRACT_HP_RESULT_VALUE = 11;
    /**
     * <code>USER_DIE_RESULT = 12;</code>
     */
    public static final int USER_DIE_RESULT_VALUE = 12;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MsgCode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MsgCode forNumber(int value) {
      switch (value) {
        case 0: return USER_ENTRY_CMD;
        case 1: return USER_ENTRY_RESULT;
        case 2: return WHO_ELSE_IS_HERE_CMD;
        case 3: return WHO_ELSE_IS_HERE_RESULT;
        case 4: return USER_MOVE_TO_CMD;
        case 5: return USER_MOVE_TO_RESULT;
        case 6: return USER_QUIT_RESULT;
        case 7: return USER_STOP_CMD;
        case 8: return USER_STOP_RESULT;
        case 9: return USER_ATTK_CMD;
        case 10: return USER_ATTK_RESULT;
        case 11: return USER_SUBTRACT_HP_RESULT;
        case 12: return USER_DIE_RESULT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MsgCode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MsgCode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MsgCode>() {
            public MsgCode findValueByNumber(int number) {
              return MsgCode.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.tinygame.herostory.msg.GameMsgProtocol.getDescriptor().getEnumTypes().get(0);
    }

    private static final MsgCode[] VALUES = values();

    public static MsgCode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MsgCode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:msg.MsgCode)
  }

  public interface UserEntryCmdOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msg.UserEntryCmd)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 用户 Id
     * </pre>
     *
     * <code>uint32 userId = 1;</code>
     * @return The userId.
     */
    int getUserId();

    /**
     * <pre>
     * 英雄形象
     * </pre>
     *
     * <code>string heroAvatar = 2;</code>
     * @return The heroAvatar.
     */
    java.lang.String getHeroAvatar();
    /**
     * <pre>
     * 英雄形象
     * </pre>
     *
     * <code>string heroAvatar = 2;</code>
     * @return The bytes for heroAvatar.
     */
    com.google.protobuf.ByteString
        getHeroAvatarBytes();
  }
  /**
   * <pre>
   * 
   * 用户入场
   * /////////////////////////////////////////////////////////////////////
   * 指令
   * </pre>
   *
   * Protobuf type {@code msg.UserEntryCmd}
   */
  public  static final class UserEntryCmd extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msg.UserEntryCmd)
      UserEntryCmdOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UserEntryCmd.newBuilder() to construct.
    private UserEntryCmd(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UserEntryCmd() {
      heroAvatar_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UserEntryCmd();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UserEntryCmd(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              userId_ = input.readUInt32();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              heroAvatar_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserEntryCmd_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserEntryCmd_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd.class, org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd.Builder.class);
    }

    public static final int USERID_FIELD_NUMBER = 1;
    private int userId_;
    /**
     * <pre>
     * 用户 Id
     * </pre>
     *
     * <code>uint32 userId = 1;</code>
     * @return The userId.
     */
    public int getUserId() {
      return userId_;
    }

    public static final int HEROAVATAR_FIELD_NUMBER = 2;
    private volatile java.lang.Object heroAvatar_;
    /**
     * <pre>
     * 英雄形象
     * </pre>
     *
     * <code>string heroAvatar = 2;</code>
     * @return The heroAvatar.
     */
    public java.lang.String getHeroAvatar() {
      java.lang.Object ref = heroAvatar_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        heroAvatar_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 英雄形象
     * </pre>
     *
     * <code>string heroAvatar = 2;</code>
     * @return The bytes for heroAvatar.
     */
    public com.google.protobuf.ByteString
        getHeroAvatarBytes() {
      java.lang.Object ref = heroAvatar_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        heroAvatar_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (userId_ != 0) {
        output.writeUInt32(1, userId_);
      }
      if (!getHeroAvatarBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, heroAvatar_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (userId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, userId_);
      }
      if (!getHeroAvatarBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, heroAvatar_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd)) {
        return super.equals(obj);
      }
      org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd other = (org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd) obj;

      if (getUserId()
          != other.getUserId()) return false;
      if (!getHeroAvatar()
          .equals(other.getHeroAvatar())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + USERID_FIELD_NUMBER;
      hash = (53 * hash) + getUserId();
      hash = (37 * hash) + HEROAVATAR_FIELD_NUMBER;
      hash = (53 * hash) + getHeroAvatar().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 
     * 用户入场
     * /////////////////////////////////////////////////////////////////////
     * 指令
     * </pre>
     *
     * Protobuf type {@code msg.UserEntryCmd}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msg.UserEntryCmd)
        org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmdOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserEntryCmd_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserEntryCmd_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd.class, org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd.Builder.class);
      }

      // Construct using org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        userId_ = 0;

        heroAvatar_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserEntryCmd_descriptor;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd getDefaultInstanceForType() {
        return org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd.getDefaultInstance();
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd build() {
        org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd buildPartial() {
        org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd result = new org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd(this);
        result.userId_ = userId_;
        result.heroAvatar_ = heroAvatar_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd) {
          return mergeFrom((org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd other) {
        if (other == org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd.getDefaultInstance()) return this;
        if (other.getUserId() != 0) {
          setUserId(other.getUserId());
        }
        if (!other.getHeroAvatar().isEmpty()) {
          heroAvatar_ = other.heroAvatar_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int userId_ ;
      /**
       * <pre>
       * 用户 Id
       * </pre>
       *
       * <code>uint32 userId = 1;</code>
       * @return The userId.
       */
      public int getUserId() {
        return userId_;
      }
      /**
       * <pre>
       * 用户 Id
       * </pre>
       *
       * <code>uint32 userId = 1;</code>
       * @param value The userId to set.
       * @return This builder for chaining.
       */
      public Builder setUserId(int value) {
        
        userId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 用户 Id
       * </pre>
       *
       * <code>uint32 userId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUserId() {
        
        userId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object heroAvatar_ = "";
      /**
       * <pre>
       * 英雄形象
       * </pre>
       *
       * <code>string heroAvatar = 2;</code>
       * @return The heroAvatar.
       */
      public java.lang.String getHeroAvatar() {
        java.lang.Object ref = heroAvatar_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          heroAvatar_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * 英雄形象
       * </pre>
       *
       * <code>string heroAvatar = 2;</code>
       * @return The bytes for heroAvatar.
       */
      public com.google.protobuf.ByteString
          getHeroAvatarBytes() {
        java.lang.Object ref = heroAvatar_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          heroAvatar_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 英雄形象
       * </pre>
       *
       * <code>string heroAvatar = 2;</code>
       * @param value The heroAvatar to set.
       * @return This builder for chaining.
       */
      public Builder setHeroAvatar(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        heroAvatar_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 英雄形象
       * </pre>
       *
       * <code>string heroAvatar = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearHeroAvatar() {
        
        heroAvatar_ = getDefaultInstance().getHeroAvatar();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 英雄形象
       * </pre>
       *
       * <code>string heroAvatar = 2;</code>
       * @param value The bytes for heroAvatar to set.
       * @return This builder for chaining.
       */
      public Builder setHeroAvatarBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        heroAvatar_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msg.UserEntryCmd)
    }

    // @@protoc_insertion_point(class_scope:msg.UserEntryCmd)
    private static final org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd();
    }

    public static org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UserEntryCmd>
        PARSER = new com.google.protobuf.AbstractParser<UserEntryCmd>() {
      @java.lang.Override
      public UserEntryCmd parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UserEntryCmd(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UserEntryCmd> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UserEntryCmd> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.tinygame.herostory.msg.GameMsgProtocol.UserEntryCmd getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UserEntryResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msg.UserEntryResult)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 用户 Id
     * </pre>
     *
     * <code>uint32 userId = 1;</code>
     * @return The userId.
     */
    int getUserId();

    /**
     * <pre>
     * 英雄形象
     * </pre>
     *
     * <code>string heroAvatar = 2;</code>
     * @return The heroAvatar.
     */
    java.lang.String getHeroAvatar();
    /**
     * <pre>
     * 英雄形象
     * </pre>
     *
     * <code>string heroAvatar = 2;</code>
     * @return The bytes for heroAvatar.
     */
    com.google.protobuf.ByteString
        getHeroAvatarBytes();
  }
  /**
   * <pre>
   * 结果
   * </pre>
   *
   * Protobuf type {@code msg.UserEntryResult}
   */
  public  static final class UserEntryResult extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msg.UserEntryResult)
      UserEntryResultOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UserEntryResult.newBuilder() to construct.
    private UserEntryResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UserEntryResult() {
      heroAvatar_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UserEntryResult();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UserEntryResult(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              userId_ = input.readUInt32();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              heroAvatar_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserEntryResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserEntryResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult.class, org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult.Builder.class);
    }

    public static final int USERID_FIELD_NUMBER = 1;
    private int userId_;
    /**
     * <pre>
     * 用户 Id
     * </pre>
     *
     * <code>uint32 userId = 1;</code>
     * @return The userId.
     */
    public int getUserId() {
      return userId_;
    }

    public static final int HEROAVATAR_FIELD_NUMBER = 2;
    private volatile java.lang.Object heroAvatar_;
    /**
     * <pre>
     * 英雄形象
     * </pre>
     *
     * <code>string heroAvatar = 2;</code>
     * @return The heroAvatar.
     */
    public java.lang.String getHeroAvatar() {
      java.lang.Object ref = heroAvatar_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        heroAvatar_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 英雄形象
     * </pre>
     *
     * <code>string heroAvatar = 2;</code>
     * @return The bytes for heroAvatar.
     */
    public com.google.protobuf.ByteString
        getHeroAvatarBytes() {
      java.lang.Object ref = heroAvatar_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        heroAvatar_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (userId_ != 0) {
        output.writeUInt32(1, userId_);
      }
      if (!getHeroAvatarBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, heroAvatar_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (userId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, userId_);
      }
      if (!getHeroAvatarBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, heroAvatar_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult)) {
        return super.equals(obj);
      }
      org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult other = (org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult) obj;

      if (getUserId()
          != other.getUserId()) return false;
      if (!getHeroAvatar()
          .equals(other.getHeroAvatar())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + USERID_FIELD_NUMBER;
      hash = (53 * hash) + getUserId();
      hash = (37 * hash) + HEROAVATAR_FIELD_NUMBER;
      hash = (53 * hash) + getHeroAvatar().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 结果
     * </pre>
     *
     * Protobuf type {@code msg.UserEntryResult}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msg.UserEntryResult)
        org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserEntryResult_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserEntryResult_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult.class, org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult.Builder.class);
      }

      // Construct using org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        userId_ = 0;

        heroAvatar_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserEntryResult_descriptor;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult getDefaultInstanceForType() {
        return org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult.getDefaultInstance();
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult build() {
        org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult buildPartial() {
        org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult result = new org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult(this);
        result.userId_ = userId_;
        result.heroAvatar_ = heroAvatar_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult) {
          return mergeFrom((org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult other) {
        if (other == org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult.getDefaultInstance()) return this;
        if (other.getUserId() != 0) {
          setUserId(other.getUserId());
        }
        if (!other.getHeroAvatar().isEmpty()) {
          heroAvatar_ = other.heroAvatar_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int userId_ ;
      /**
       * <pre>
       * 用户 Id
       * </pre>
       *
       * <code>uint32 userId = 1;</code>
       * @return The userId.
       */
      public int getUserId() {
        return userId_;
      }
      /**
       * <pre>
       * 用户 Id
       * </pre>
       *
       * <code>uint32 userId = 1;</code>
       * @param value The userId to set.
       * @return This builder for chaining.
       */
      public Builder setUserId(int value) {
        
        userId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 用户 Id
       * </pre>
       *
       * <code>uint32 userId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUserId() {
        
        userId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object heroAvatar_ = "";
      /**
       * <pre>
       * 英雄形象
       * </pre>
       *
       * <code>string heroAvatar = 2;</code>
       * @return The heroAvatar.
       */
      public java.lang.String getHeroAvatar() {
        java.lang.Object ref = heroAvatar_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          heroAvatar_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * 英雄形象
       * </pre>
       *
       * <code>string heroAvatar = 2;</code>
       * @return The bytes for heroAvatar.
       */
      public com.google.protobuf.ByteString
          getHeroAvatarBytes() {
        java.lang.Object ref = heroAvatar_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          heroAvatar_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 英雄形象
       * </pre>
       *
       * <code>string heroAvatar = 2;</code>
       * @param value The heroAvatar to set.
       * @return This builder for chaining.
       */
      public Builder setHeroAvatar(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        heroAvatar_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 英雄形象
       * </pre>
       *
       * <code>string heroAvatar = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearHeroAvatar() {
        
        heroAvatar_ = getDefaultInstance().getHeroAvatar();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 英雄形象
       * </pre>
       *
       * <code>string heroAvatar = 2;</code>
       * @param value The bytes for heroAvatar to set.
       * @return This builder for chaining.
       */
      public Builder setHeroAvatarBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        heroAvatar_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msg.UserEntryResult)
    }

    // @@protoc_insertion_point(class_scope:msg.UserEntryResult)
    private static final org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult();
    }

    public static org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UserEntryResult>
        PARSER = new com.google.protobuf.AbstractParser<UserEntryResult>() {
      @java.lang.Override
      public UserEntryResult parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UserEntryResult(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UserEntryResult> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UserEntryResult> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.tinygame.herostory.msg.GameMsgProtocol.UserEntryResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface WhoElseIsHereCmdOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msg.WhoElseIsHereCmd)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   * 还有谁在场
   * /////////////////////////////////////////////////////////////////////
   * 指令
   * </pre>
   *
   * Protobuf type {@code msg.WhoElseIsHereCmd}
   */
  public  static final class WhoElseIsHereCmd extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msg.WhoElseIsHereCmd)
      WhoElseIsHereCmdOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WhoElseIsHereCmd.newBuilder() to construct.
    private WhoElseIsHereCmd(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WhoElseIsHereCmd() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WhoElseIsHereCmd();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WhoElseIsHereCmd(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_WhoElseIsHereCmd_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_WhoElseIsHereCmd_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd.class, org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd)) {
        return super.equals(obj);
      }
      org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd other = (org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd) obj;

      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 还有谁在场
     * /////////////////////////////////////////////////////////////////////
     * 指令
     * </pre>
     *
     * Protobuf type {@code msg.WhoElseIsHereCmd}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msg.WhoElseIsHereCmd)
        org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmdOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_WhoElseIsHereCmd_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_WhoElseIsHereCmd_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd.class, org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd.Builder.class);
      }

      // Construct using org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_WhoElseIsHereCmd_descriptor;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd getDefaultInstanceForType() {
        return org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd.getDefaultInstance();
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd build() {
        org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd buildPartial() {
        org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd result = new org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd(this);
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd) {
          return mergeFrom((org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd other) {
        if (other == org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msg.WhoElseIsHereCmd)
    }

    // @@protoc_insertion_point(class_scope:msg.WhoElseIsHereCmd)
    private static final org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd();
    }

    public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WhoElseIsHereCmd>
        PARSER = new com.google.protobuf.AbstractParser<WhoElseIsHereCmd>() {
      @java.lang.Override
      public WhoElseIsHereCmd parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WhoElseIsHereCmd(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WhoElseIsHereCmd> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WhoElseIsHereCmd> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereCmd getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface WhoElseIsHereResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msg.WhoElseIsHereResult)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 用户信息数组
     * </pre>
     *
     * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
     */
    java.util.List<org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo> 
        getUserInfoList();
    /**
     * <pre>
     * 用户信息数组
     * </pre>
     *
     * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
     */
    org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo getUserInfo(int index);
    /**
     * <pre>
     * 用户信息数组
     * </pre>
     *
     * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
     */
    int getUserInfoCount();
    /**
     * <pre>
     * 用户信息数组
     * </pre>
     *
     * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
     */
    java.util.List<? extends org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfoOrBuilder> 
        getUserInfoOrBuilderList();
    /**
     * <pre>
     * 用户信息数组
     * </pre>
     *
     * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
     */
    org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfoOrBuilder getUserInfoOrBuilder(
        int index);
  }
  /**
   * <pre>
   * 结果
   * </pre>
   *
   * Protobuf type {@code msg.WhoElseIsHereResult}
   */
  public  static final class WhoElseIsHereResult extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msg.WhoElseIsHereResult)
      WhoElseIsHereResultOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WhoElseIsHereResult.newBuilder() to construct.
    private WhoElseIsHereResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WhoElseIsHereResult() {
      userInfo_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WhoElseIsHereResult();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WhoElseIsHereResult(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                userInfo_ = new java.util.ArrayList<org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              userInfo_.add(
                  input.readMessage(org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          userInfo_ = java.util.Collections.unmodifiableList(userInfo_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_WhoElseIsHereResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_WhoElseIsHereResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.class, org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.Builder.class);
    }

    public interface UserInfoOrBuilder extends
        // @@protoc_insertion_point(interface_extends:msg.WhoElseIsHereResult.UserInfo)
        com.google.protobuf.MessageOrBuilder {

      /**
       * <pre>
       * 用户 Id
       * </pre>
       *
       * <code>uint32 userId = 1;</code>
       * @return The userId.
       */
      int getUserId();

      /**
       * <pre>
       * 英雄形象
       * </pre>
       *
       * <code>string heroAvatar = 2;</code>
       * @return The heroAvatar.
       */
      java.lang.String getHeroAvatar();
      /**
       * <pre>
       * 英雄形象
       * </pre>
       *
       * <code>string heroAvatar = 2;</code>
       * @return The bytes for heroAvatar.
       */
      com.google.protobuf.ByteString
          getHeroAvatarBytes();
    }
    /**
     * <pre>
     * 用户信息
     * </pre>
     *
     * Protobuf type {@code msg.WhoElseIsHereResult.UserInfo}
     */
    public  static final class UserInfo extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:msg.WhoElseIsHereResult.UserInfo)
        UserInfoOrBuilder {
    private static final long serialVersionUID = 0L;
      // Use UserInfo.newBuilder() to construct.
      private UserInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private UserInfo() {
        heroAvatar_ = "";
      }

      @java.lang.Override
      @SuppressWarnings({"unused"})
      protected java.lang.Object newInstance(
          UnusedPrivateParameter unused) {
        return new UserInfo();
      }

      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private UserInfo(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
            com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {

                userId_ = input.readUInt32();
                break;
              }
              case 18: {
                java.lang.String s = input.readStringRequireUtf8();

                heroAvatar_ = s;
                break;
              }
              default: {
                if (!parseUnknownField(
                    input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(
              e).setUnfinishedMessage(this);
        } finally {
          this.unknownFields = unknownFields.build();
          makeExtensionsImmutable();
        }
      }
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_WhoElseIsHereResult_UserInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_WhoElseIsHereResult_UserInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo.class, org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo.Builder.class);
      }

      public static final int USERID_FIELD_NUMBER = 1;
      private int userId_;
      /**
       * <pre>
       * 用户 Id
       * </pre>
       *
       * <code>uint32 userId = 1;</code>
       * @return The userId.
       */
      public int getUserId() {
        return userId_;
      }

      public static final int HEROAVATAR_FIELD_NUMBER = 2;
      private volatile java.lang.Object heroAvatar_;
      /**
       * <pre>
       * 英雄形象
       * </pre>
       *
       * <code>string heroAvatar = 2;</code>
       * @return The heroAvatar.
       */
      public java.lang.String getHeroAvatar() {
        java.lang.Object ref = heroAvatar_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.google.protobuf.ByteString bs = 
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          heroAvatar_ = s;
          return s;
        }
      }
      /**
       * <pre>
       * 英雄形象
       * </pre>
       *
       * <code>string heroAvatar = 2;</code>
       * @return The bytes for heroAvatar.
       */
      public com.google.protobuf.ByteString
          getHeroAvatarBytes() {
        java.lang.Object ref = heroAvatar_;
        if (ref instanceof java.lang.String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          heroAvatar_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      private byte memoizedIsInitialized = -1;
      @java.lang.Override
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
      }

      @java.lang.Override
      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        if (userId_ != 0) {
          output.writeUInt32(1, userId_);
        }
        if (!getHeroAvatarBytes().isEmpty()) {
          com.google.protobuf.GeneratedMessageV3.writeString(output, 2, heroAvatar_);
        }
        unknownFields.writeTo(output);
      }

      @java.lang.Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (userId_ != 0) {
          size += com.google.protobuf.CodedOutputStream
            .computeUInt32Size(1, userId_);
        }
        if (!getHeroAvatarBytes().isEmpty()) {
          size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, heroAvatar_);
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
      }

      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
         return true;
        }
        if (!(obj instanceof org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo)) {
          return super.equals(obj);
        }
        org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo other = (org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo) obj;

        if (getUserId()
            != other.getUserId()) return false;
        if (!getHeroAvatar()
            .equals(other.getHeroAvatar())) return false;
        if (!unknownFields.equals(other.unknownFields)) return false;
        return true;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + USERID_FIELD_NUMBER;
        hash = (53 * hash) + getUserId();
        hash = (37 * hash) + HEROAVATAR_FIELD_NUMBER;
        hash = (53 * hash) + getHeroAvatar().hashCode();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      @java.lang.Override
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      @java.lang.Override
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * <pre>
       * 用户信息
       * </pre>
       *
       * Protobuf type {@code msg.WhoElseIsHereResult.UserInfo}
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:msg.WhoElseIsHereResult.UserInfo)
          org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfoOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_WhoElseIsHereResult_UserInfo_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_WhoElseIsHereResult_UserInfo_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo.class, org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo.Builder.class);
        }

        // Construct using org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }

        private Builder(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessageV3
                  .alwaysUseFieldBuilders) {
          }
        }
        @java.lang.Override
        public Builder clear() {
          super.clear();
          userId_ = 0;

          heroAvatar_ = "";

          return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_WhoElseIsHereResult_UserInfo_descriptor;
        }

        @java.lang.Override
        public org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo getDefaultInstanceForType() {
          return org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo.getDefaultInstance();
        }

        @java.lang.Override
        public org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo build() {
          org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @java.lang.Override
        public org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo buildPartial() {
          org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo result = new org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo(this);
          result.userId_ = userId_;
          result.heroAvatar_ = heroAvatar_;
          onBuilt();
          return result;
        }

        @java.lang.Override
        public Builder clone() {
          return super.clone();
        }
        @java.lang.Override
        public Builder setField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.setField(field, value);
        }
        @java.lang.Override
        public Builder clearField(
            com.google.protobuf.Descriptors.FieldDescriptor field) {
          return super.clearField(field);
        }
        @java.lang.Override
        public Builder clearOneof(
            com.google.protobuf.Descriptors.OneofDescriptor oneof) {
          return super.clearOneof(oneof);
        }
        @java.lang.Override
        public Builder setRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, java.lang.Object value) {
          return super.setRepeatedField(field, index, value);
        }
        @java.lang.Override
        public Builder addRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.addRepeatedField(field, value);
        }
        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo) {
            return mergeFrom((org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo other) {
          if (other == org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo.getDefaultInstance()) return this;
          if (other.getUserId() != 0) {
            setUserId(other.getUserId());
          }
          if (!other.getHeroAvatar().isEmpty()) {
            heroAvatar_ = other.heroAvatar_;
            onChanged();
          }
          this.mergeUnknownFields(other.unknownFields);
          onChanged();
          return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
          return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }

        private int userId_ ;
        /**
         * <pre>
         * 用户 Id
         * </pre>
         *
         * <code>uint32 userId = 1;</code>
         * @return The userId.
         */
        public int getUserId() {
          return userId_;
        }
        /**
         * <pre>
         * 用户 Id
         * </pre>
         *
         * <code>uint32 userId = 1;</code>
         * @param value The userId to set.
         * @return This builder for chaining.
         */
        public Builder setUserId(int value) {
          
          userId_ = value;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * 用户 Id
         * </pre>
         *
         * <code>uint32 userId = 1;</code>
         * @return This builder for chaining.
         */
        public Builder clearUserId() {
          
          userId_ = 0;
          onChanged();
          return this;
        }

        private java.lang.Object heroAvatar_ = "";
        /**
         * <pre>
         * 英雄形象
         * </pre>
         *
         * <code>string heroAvatar = 2;</code>
         * @return The heroAvatar.
         */
        public java.lang.String getHeroAvatar() {
          java.lang.Object ref = heroAvatar_;
          if (!(ref instanceof java.lang.String)) {
            com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            heroAvatar_ = s;
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <pre>
         * 英雄形象
         * </pre>
         *
         * <code>string heroAvatar = 2;</code>
         * @return The bytes for heroAvatar.
         */
        public com.google.protobuf.ByteString
            getHeroAvatarBytes() {
          java.lang.Object ref = heroAvatar_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            heroAvatar_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <pre>
         * 英雄形象
         * </pre>
         *
         * <code>string heroAvatar = 2;</code>
         * @param value The heroAvatar to set.
         * @return This builder for chaining.
         */
        public Builder setHeroAvatar(
            java.lang.String value) {
          if (value == null) {
    throw new NullPointerException();
  }
  
          heroAvatar_ = value;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * 英雄形象
         * </pre>
         *
         * <code>string heroAvatar = 2;</code>
         * @return This builder for chaining.
         */
        public Builder clearHeroAvatar() {
          
          heroAvatar_ = getDefaultInstance().getHeroAvatar();
          onChanged();
          return this;
        }
        /**
         * <pre>
         * 英雄形象
         * </pre>
         *
         * <code>string heroAvatar = 2;</code>
         * @param value The bytes for heroAvatar to set.
         * @return This builder for chaining.
         */
        public Builder setHeroAvatarBytes(
            com.google.protobuf.ByteString value) {
          if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
          
          heroAvatar_ = value;
          onChanged();
          return this;
        }
        @java.lang.Override
        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:msg.WhoElseIsHereResult.UserInfo)
      }

      // @@protoc_insertion_point(class_scope:msg.WhoElseIsHereResult.UserInfo)
      private static final org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo();
      }

      public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      private static final com.google.protobuf.Parser<UserInfo>
          PARSER = new com.google.protobuf.AbstractParser<UserInfo>() {
        @java.lang.Override
        public UserInfo parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UserInfo(input, extensionRegistry);
        }
      };

      public static com.google.protobuf.Parser<UserInfo> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.google.protobuf.Parser<UserInfo> getParserForType() {
        return PARSER;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    public static final int USERINFO_FIELD_NUMBER = 1;
    private java.util.List<org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo> userInfo_;
    /**
     * <pre>
     * 用户信息数组
     * </pre>
     *
     * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
     */
    public java.util.List<org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo> getUserInfoList() {
      return userInfo_;
    }
    /**
     * <pre>
     * 用户信息数组
     * </pre>
     *
     * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
     */
    public java.util.List<? extends org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfoOrBuilder> 
        getUserInfoOrBuilderList() {
      return userInfo_;
    }
    /**
     * <pre>
     * 用户信息数组
     * </pre>
     *
     * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
     */
    public int getUserInfoCount() {
      return userInfo_.size();
    }
    /**
     * <pre>
     * 用户信息数组
     * </pre>
     *
     * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
     */
    public org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo getUserInfo(int index) {
      return userInfo_.get(index);
    }
    /**
     * <pre>
     * 用户信息数组
     * </pre>
     *
     * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
     */
    public org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfoOrBuilder getUserInfoOrBuilder(
        int index) {
      return userInfo_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < userInfo_.size(); i++) {
        output.writeMessage(1, userInfo_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < userInfo_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, userInfo_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult)) {
        return super.equals(obj);
      }
      org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult other = (org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult) obj;

      if (!getUserInfoList()
          .equals(other.getUserInfoList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getUserInfoCount() > 0) {
        hash = (37 * hash) + USERINFO_FIELD_NUMBER;
        hash = (53 * hash) + getUserInfoList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 结果
     * </pre>
     *
     * Protobuf type {@code msg.WhoElseIsHereResult}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msg.WhoElseIsHereResult)
        org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_WhoElseIsHereResult_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_WhoElseIsHereResult_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.class, org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.Builder.class);
      }

      // Construct using org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getUserInfoFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (userInfoBuilder_ == null) {
          userInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          userInfoBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_WhoElseIsHereResult_descriptor;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult getDefaultInstanceForType() {
        return org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.getDefaultInstance();
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult build() {
        org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult buildPartial() {
        org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult result = new org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult(this);
        int from_bitField0_ = bitField0_;
        if (userInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            userInfo_ = java.util.Collections.unmodifiableList(userInfo_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.userInfo_ = userInfo_;
        } else {
          result.userInfo_ = userInfoBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult) {
          return mergeFrom((org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult other) {
        if (other == org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.getDefaultInstance()) return this;
        if (userInfoBuilder_ == null) {
          if (!other.userInfo_.isEmpty()) {
            if (userInfo_.isEmpty()) {
              userInfo_ = other.userInfo_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureUserInfoIsMutable();
              userInfo_.addAll(other.userInfo_);
            }
            onChanged();
          }
        } else {
          if (!other.userInfo_.isEmpty()) {
            if (userInfoBuilder_.isEmpty()) {
              userInfoBuilder_.dispose();
              userInfoBuilder_ = null;
              userInfo_ = other.userInfo_;
              bitField0_ = (bitField0_ & ~0x00000001);
              userInfoBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getUserInfoFieldBuilder() : null;
            } else {
              userInfoBuilder_.addAllMessages(other.userInfo_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo> userInfo_ =
        java.util.Collections.emptyList();
      private void ensureUserInfoIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          userInfo_ = new java.util.ArrayList<org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo>(userInfo_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo, org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo.Builder, org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfoOrBuilder> userInfoBuilder_;

      /**
       * <pre>
       * 用户信息数组
       * </pre>
       *
       * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
       */
      public java.util.List<org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo> getUserInfoList() {
        if (userInfoBuilder_ == null) {
          return java.util.Collections.unmodifiableList(userInfo_);
        } else {
          return userInfoBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * 用户信息数组
       * </pre>
       *
       * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
       */
      public int getUserInfoCount() {
        if (userInfoBuilder_ == null) {
          return userInfo_.size();
        } else {
          return userInfoBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * 用户信息数组
       * </pre>
       *
       * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
       */
      public org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo getUserInfo(int index) {
        if (userInfoBuilder_ == null) {
          return userInfo_.get(index);
        } else {
          return userInfoBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * 用户信息数组
       * </pre>
       *
       * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
       */
      public Builder setUserInfo(
          int index, org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo value) {
        if (userInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUserInfoIsMutable();
          userInfo_.set(index, value);
          onChanged();
        } else {
          userInfoBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * 用户信息数组
       * </pre>
       *
       * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
       */
      public Builder setUserInfo(
          int index, org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo.Builder builderForValue) {
        if (userInfoBuilder_ == null) {
          ensureUserInfoIsMutable();
          userInfo_.set(index, builderForValue.build());
          onChanged();
        } else {
          userInfoBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * 用户信息数组
       * </pre>
       *
       * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
       */
      public Builder addUserInfo(org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo value) {
        if (userInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUserInfoIsMutable();
          userInfo_.add(value);
          onChanged();
        } else {
          userInfoBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * 用户信息数组
       * </pre>
       *
       * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
       */
      public Builder addUserInfo(
          int index, org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo value) {
        if (userInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUserInfoIsMutable();
          userInfo_.add(index, value);
          onChanged();
        } else {
          userInfoBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * 用户信息数组
       * </pre>
       *
       * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
       */
      public Builder addUserInfo(
          org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo.Builder builderForValue) {
        if (userInfoBuilder_ == null) {
          ensureUserInfoIsMutable();
          userInfo_.add(builderForValue.build());
          onChanged();
        } else {
          userInfoBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * 用户信息数组
       * </pre>
       *
       * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
       */
      public Builder addUserInfo(
          int index, org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo.Builder builderForValue) {
        if (userInfoBuilder_ == null) {
          ensureUserInfoIsMutable();
          userInfo_.add(index, builderForValue.build());
          onChanged();
        } else {
          userInfoBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * 用户信息数组
       * </pre>
       *
       * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
       */
      public Builder addAllUserInfo(
          java.lang.Iterable<? extends org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo> values) {
        if (userInfoBuilder_ == null) {
          ensureUserInfoIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, userInfo_);
          onChanged();
        } else {
          userInfoBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * 用户信息数组
       * </pre>
       *
       * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
       */
      public Builder clearUserInfo() {
        if (userInfoBuilder_ == null) {
          userInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          userInfoBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * 用户信息数组
       * </pre>
       *
       * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
       */
      public Builder removeUserInfo(int index) {
        if (userInfoBuilder_ == null) {
          ensureUserInfoIsMutable();
          userInfo_.remove(index);
          onChanged();
        } else {
          userInfoBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * 用户信息数组
       * </pre>
       *
       * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
       */
      public org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo.Builder getUserInfoBuilder(
          int index) {
        return getUserInfoFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * 用户信息数组
       * </pre>
       *
       * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
       */
      public org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfoOrBuilder getUserInfoOrBuilder(
          int index) {
        if (userInfoBuilder_ == null) {
          return userInfo_.get(index);  } else {
          return userInfoBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * 用户信息数组
       * </pre>
       *
       * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
       */
      public java.util.List<? extends org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfoOrBuilder> 
           getUserInfoOrBuilderList() {
        if (userInfoBuilder_ != null) {
          return userInfoBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(userInfo_);
        }
      }
      /**
       * <pre>
       * 用户信息数组
       * </pre>
       *
       * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
       */
      public org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo.Builder addUserInfoBuilder() {
        return getUserInfoFieldBuilder().addBuilder(
            org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo.getDefaultInstance());
      }
      /**
       * <pre>
       * 用户信息数组
       * </pre>
       *
       * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
       */
      public org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo.Builder addUserInfoBuilder(
          int index) {
        return getUserInfoFieldBuilder().addBuilder(
            index, org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo.getDefaultInstance());
      }
      /**
       * <pre>
       * 用户信息数组
       * </pre>
       *
       * <code>repeated .msg.WhoElseIsHereResult.UserInfo userInfo = 1;</code>
       */
      public java.util.List<org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo.Builder> 
           getUserInfoBuilderList() {
        return getUserInfoFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo, org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo.Builder, org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfoOrBuilder> 
          getUserInfoFieldBuilder() {
        if (userInfoBuilder_ == null) {
          userInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo, org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfo.Builder, org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult.UserInfoOrBuilder>(
                  userInfo_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          userInfo_ = null;
        }
        return userInfoBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msg.WhoElseIsHereResult)
    }

    // @@protoc_insertion_point(class_scope:msg.WhoElseIsHereResult)
    private static final org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult();
    }

    public static org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WhoElseIsHereResult>
        PARSER = new com.google.protobuf.AbstractParser<WhoElseIsHereResult>() {
      @java.lang.Override
      public WhoElseIsHereResult parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WhoElseIsHereResult(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WhoElseIsHereResult> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WhoElseIsHereResult> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.tinygame.herostory.msg.GameMsgProtocol.WhoElseIsHereResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UserMoveToCmdOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msg.UserMoveToCmd)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 
     * XXX 注意: 用户移动指令中没有用户 Id,
     * 这是为什么?
     * 
     * 移动到位置 X
     * </pre>
     *
     * <code>float moveToPosX = 1;</code>
     * @return The moveToPosX.
     */
    float getMoveToPosX();

    /**
     * <pre>
     * 移动到位置 Y
     * </pre>
     *
     * <code>float moveToPosY = 2;</code>
     * @return The moveToPosY.
     */
    float getMoveToPosY();
  }
  /**
   * <pre>
   * 
   * 用户移动
   * /////////////////////////////////////////////////////////////////////
   * 指令
   * </pre>
   *
   * Protobuf type {@code msg.UserMoveToCmd}
   */
  public  static final class UserMoveToCmd extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msg.UserMoveToCmd)
      UserMoveToCmdOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UserMoveToCmd.newBuilder() to construct.
    private UserMoveToCmd(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UserMoveToCmd() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UserMoveToCmd();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UserMoveToCmd(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 13: {

              moveToPosX_ = input.readFloat();
              break;
            }
            case 21: {

              moveToPosY_ = input.readFloat();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserMoveToCmd_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserMoveToCmd_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd.class, org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd.Builder.class);
    }

    public static final int MOVETOPOSX_FIELD_NUMBER = 1;
    private float moveToPosX_;
    /**
     * <pre>
     * 
     * XXX 注意: 用户移动指令中没有用户 Id,
     * 这是为什么?
     * 
     * 移动到位置 X
     * </pre>
     *
     * <code>float moveToPosX = 1;</code>
     * @return The moveToPosX.
     */
    public float getMoveToPosX() {
      return moveToPosX_;
    }

    public static final int MOVETOPOSY_FIELD_NUMBER = 2;
    private float moveToPosY_;
    /**
     * <pre>
     * 移动到位置 Y
     * </pre>
     *
     * <code>float moveToPosY = 2;</code>
     * @return The moveToPosY.
     */
    public float getMoveToPosY() {
      return moveToPosY_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (moveToPosX_ != 0F) {
        output.writeFloat(1, moveToPosX_);
      }
      if (moveToPosY_ != 0F) {
        output.writeFloat(2, moveToPosY_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (moveToPosX_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(1, moveToPosX_);
      }
      if (moveToPosY_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, moveToPosY_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd)) {
        return super.equals(obj);
      }
      org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd other = (org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd) obj;

      if (java.lang.Float.floatToIntBits(getMoveToPosX())
          != java.lang.Float.floatToIntBits(
              other.getMoveToPosX())) return false;
      if (java.lang.Float.floatToIntBits(getMoveToPosY())
          != java.lang.Float.floatToIntBits(
              other.getMoveToPosY())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + MOVETOPOSX_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getMoveToPosX());
      hash = (37 * hash) + MOVETOPOSY_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getMoveToPosY());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 
     * 用户移动
     * /////////////////////////////////////////////////////////////////////
     * 指令
     * </pre>
     *
     * Protobuf type {@code msg.UserMoveToCmd}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msg.UserMoveToCmd)
        org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmdOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserMoveToCmd_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserMoveToCmd_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd.class, org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd.Builder.class);
      }

      // Construct using org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        moveToPosX_ = 0F;

        moveToPosY_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserMoveToCmd_descriptor;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd getDefaultInstanceForType() {
        return org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd.getDefaultInstance();
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd build() {
        org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd buildPartial() {
        org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd result = new org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd(this);
        result.moveToPosX_ = moveToPosX_;
        result.moveToPosY_ = moveToPosY_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd) {
          return mergeFrom((org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd other) {
        if (other == org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd.getDefaultInstance()) return this;
        if (other.getMoveToPosX() != 0F) {
          setMoveToPosX(other.getMoveToPosX());
        }
        if (other.getMoveToPosY() != 0F) {
          setMoveToPosY(other.getMoveToPosY());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float moveToPosX_ ;
      /**
       * <pre>
       * 
       * XXX 注意: 用户移动指令中没有用户 Id,
       * 这是为什么?
       * 
       * 移动到位置 X
       * </pre>
       *
       * <code>float moveToPosX = 1;</code>
       * @return The moveToPosX.
       */
      public float getMoveToPosX() {
        return moveToPosX_;
      }
      /**
       * <pre>
       * 
       * XXX 注意: 用户移动指令中没有用户 Id,
       * 这是为什么?
       * 
       * 移动到位置 X
       * </pre>
       *
       * <code>float moveToPosX = 1;</code>
       * @param value The moveToPosX to set.
       * @return This builder for chaining.
       */
      public Builder setMoveToPosX(float value) {
        
        moveToPosX_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 
       * XXX 注意: 用户移动指令中没有用户 Id,
       * 这是为什么?
       * 
       * 移动到位置 X
       * </pre>
       *
       * <code>float moveToPosX = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMoveToPosX() {
        
        moveToPosX_ = 0F;
        onChanged();
        return this;
      }

      private float moveToPosY_ ;
      /**
       * <pre>
       * 移动到位置 Y
       * </pre>
       *
       * <code>float moveToPosY = 2;</code>
       * @return The moveToPosY.
       */
      public float getMoveToPosY() {
        return moveToPosY_;
      }
      /**
       * <pre>
       * 移动到位置 Y
       * </pre>
       *
       * <code>float moveToPosY = 2;</code>
       * @param value The moveToPosY to set.
       * @return This builder for chaining.
       */
      public Builder setMoveToPosY(float value) {
        
        moveToPosY_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 移动到位置 Y
       * </pre>
       *
       * <code>float moveToPosY = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMoveToPosY() {
        
        moveToPosY_ = 0F;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msg.UserMoveToCmd)
    }

    // @@protoc_insertion_point(class_scope:msg.UserMoveToCmd)
    private static final org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd();
    }

    public static org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UserMoveToCmd>
        PARSER = new com.google.protobuf.AbstractParser<UserMoveToCmd>() {
      @java.lang.Override
      public UserMoveToCmd parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UserMoveToCmd(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UserMoveToCmd> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UserMoveToCmd> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToCmd getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UserMoveToResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msg.UserMoveToResult)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 移动用户 Id
     * </pre>
     *
     * <code>uint32 moveUserId = 1;</code>
     * @return The moveUserId.
     */
    int getMoveUserId();

    /**
     * <pre>
     * 移动到位置 X
     * </pre>
     *
     * <code>float moveToPosX = 2;</code>
     * @return The moveToPosX.
     */
    float getMoveToPosX();

    /**
     * <pre>
     * 移动到位置 Y
     * </pre>
     *
     * <code>float moveToPosY = 3;</code>
     * @return The moveToPosY.
     */
    float getMoveToPosY();
  }
  /**
   * <pre>
   * 结果
   * </pre>
   *
   * Protobuf type {@code msg.UserMoveToResult}
   */
  public  static final class UserMoveToResult extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msg.UserMoveToResult)
      UserMoveToResultOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UserMoveToResult.newBuilder() to construct.
    private UserMoveToResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UserMoveToResult() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UserMoveToResult();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UserMoveToResult(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              moveUserId_ = input.readUInt32();
              break;
            }
            case 21: {

              moveToPosX_ = input.readFloat();
              break;
            }
            case 29: {

              moveToPosY_ = input.readFloat();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserMoveToResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserMoveToResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult.class, org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult.Builder.class);
    }

    public static final int MOVEUSERID_FIELD_NUMBER = 1;
    private int moveUserId_;
    /**
     * <pre>
     * 移动用户 Id
     * </pre>
     *
     * <code>uint32 moveUserId = 1;</code>
     * @return The moveUserId.
     */
    public int getMoveUserId() {
      return moveUserId_;
    }

    public static final int MOVETOPOSX_FIELD_NUMBER = 2;
    private float moveToPosX_;
    /**
     * <pre>
     * 移动到位置 X
     * </pre>
     *
     * <code>float moveToPosX = 2;</code>
     * @return The moveToPosX.
     */
    public float getMoveToPosX() {
      return moveToPosX_;
    }

    public static final int MOVETOPOSY_FIELD_NUMBER = 3;
    private float moveToPosY_;
    /**
     * <pre>
     * 移动到位置 Y
     * </pre>
     *
     * <code>float moveToPosY = 3;</code>
     * @return The moveToPosY.
     */
    public float getMoveToPosY() {
      return moveToPosY_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (moveUserId_ != 0) {
        output.writeUInt32(1, moveUserId_);
      }
      if (moveToPosX_ != 0F) {
        output.writeFloat(2, moveToPosX_);
      }
      if (moveToPosY_ != 0F) {
        output.writeFloat(3, moveToPosY_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (moveUserId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, moveUserId_);
      }
      if (moveToPosX_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, moveToPosX_);
      }
      if (moveToPosY_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, moveToPosY_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult)) {
        return super.equals(obj);
      }
      org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult other = (org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult) obj;

      if (getMoveUserId()
          != other.getMoveUserId()) return false;
      if (java.lang.Float.floatToIntBits(getMoveToPosX())
          != java.lang.Float.floatToIntBits(
              other.getMoveToPosX())) return false;
      if (java.lang.Float.floatToIntBits(getMoveToPosY())
          != java.lang.Float.floatToIntBits(
              other.getMoveToPosY())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + MOVEUSERID_FIELD_NUMBER;
      hash = (53 * hash) + getMoveUserId();
      hash = (37 * hash) + MOVETOPOSX_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getMoveToPosX());
      hash = (37 * hash) + MOVETOPOSY_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getMoveToPosY());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 结果
     * </pre>
     *
     * Protobuf type {@code msg.UserMoveToResult}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msg.UserMoveToResult)
        org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserMoveToResult_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserMoveToResult_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult.class, org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult.Builder.class);
      }

      // Construct using org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        moveUserId_ = 0;

        moveToPosX_ = 0F;

        moveToPosY_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserMoveToResult_descriptor;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult getDefaultInstanceForType() {
        return org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult.getDefaultInstance();
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult build() {
        org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult buildPartial() {
        org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult result = new org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult(this);
        result.moveUserId_ = moveUserId_;
        result.moveToPosX_ = moveToPosX_;
        result.moveToPosY_ = moveToPosY_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult) {
          return mergeFrom((org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult other) {
        if (other == org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult.getDefaultInstance()) return this;
        if (other.getMoveUserId() != 0) {
          setMoveUserId(other.getMoveUserId());
        }
        if (other.getMoveToPosX() != 0F) {
          setMoveToPosX(other.getMoveToPosX());
        }
        if (other.getMoveToPosY() != 0F) {
          setMoveToPosY(other.getMoveToPosY());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int moveUserId_ ;
      /**
       * <pre>
       * 移动用户 Id
       * </pre>
       *
       * <code>uint32 moveUserId = 1;</code>
       * @return The moveUserId.
       */
      public int getMoveUserId() {
        return moveUserId_;
      }
      /**
       * <pre>
       * 移动用户 Id
       * </pre>
       *
       * <code>uint32 moveUserId = 1;</code>
       * @param value The moveUserId to set.
       * @return This builder for chaining.
       */
      public Builder setMoveUserId(int value) {
        
        moveUserId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 移动用户 Id
       * </pre>
       *
       * <code>uint32 moveUserId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMoveUserId() {
        
        moveUserId_ = 0;
        onChanged();
        return this;
      }

      private float moveToPosX_ ;
      /**
       * <pre>
       * 移动到位置 X
       * </pre>
       *
       * <code>float moveToPosX = 2;</code>
       * @return The moveToPosX.
       */
      public float getMoveToPosX() {
        return moveToPosX_;
      }
      /**
       * <pre>
       * 移动到位置 X
       * </pre>
       *
       * <code>float moveToPosX = 2;</code>
       * @param value The moveToPosX to set.
       * @return This builder for chaining.
       */
      public Builder setMoveToPosX(float value) {
        
        moveToPosX_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 移动到位置 X
       * </pre>
       *
       * <code>float moveToPosX = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMoveToPosX() {
        
        moveToPosX_ = 0F;
        onChanged();
        return this;
      }

      private float moveToPosY_ ;
      /**
       * <pre>
       * 移动到位置 Y
       * </pre>
       *
       * <code>float moveToPosY = 3;</code>
       * @return The moveToPosY.
       */
      public float getMoveToPosY() {
        return moveToPosY_;
      }
      /**
       * <pre>
       * 移动到位置 Y
       * </pre>
       *
       * <code>float moveToPosY = 3;</code>
       * @param value The moveToPosY to set.
       * @return This builder for chaining.
       */
      public Builder setMoveToPosY(float value) {
        
        moveToPosY_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 移动到位置 Y
       * </pre>
       *
       * <code>float moveToPosY = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMoveToPosY() {
        
        moveToPosY_ = 0F;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msg.UserMoveToResult)
    }

    // @@protoc_insertion_point(class_scope:msg.UserMoveToResult)
    private static final org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult();
    }

    public static org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UserMoveToResult>
        PARSER = new com.google.protobuf.AbstractParser<UserMoveToResult>() {
      @java.lang.Override
      public UserMoveToResult parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UserMoveToResult(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UserMoveToResult> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UserMoveToResult> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.tinygame.herostory.msg.GameMsgProtocol.UserMoveToResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UserQuitResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msg.UserQuitResult)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 退出用户 Id
     * </pre>
     *
     * <code>uint32 quitUserId = 1;</code>
     * @return The quitUserId.
     */
    int getQuitUserId();
  }
  /**
   * <pre>
   * 
   * 用户退场
   * /////////////////////////////////////////////////////////////////////
   * 
   * XXX 注意: 用户退场不需要指令, 因为是在断开服务器的时候执行
   * 
   * 结果
   * </pre>
   *
   * Protobuf type {@code msg.UserQuitResult}
   */
  public  static final class UserQuitResult extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msg.UserQuitResult)
      UserQuitResultOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UserQuitResult.newBuilder() to construct.
    private UserQuitResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UserQuitResult() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UserQuitResult();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UserQuitResult(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              quitUserId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserQuitResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserQuitResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult.class, org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult.Builder.class);
    }

    public static final int QUITUSERID_FIELD_NUMBER = 1;
    private int quitUserId_;
    /**
     * <pre>
     * 退出用户 Id
     * </pre>
     *
     * <code>uint32 quitUserId = 1;</code>
     * @return The quitUserId.
     */
    public int getQuitUserId() {
      return quitUserId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (quitUserId_ != 0) {
        output.writeUInt32(1, quitUserId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (quitUserId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, quitUserId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult)) {
        return super.equals(obj);
      }
      org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult other = (org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult) obj;

      if (getQuitUserId()
          != other.getQuitUserId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + QUITUSERID_FIELD_NUMBER;
      hash = (53 * hash) + getQuitUserId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 
     * 用户退场
     * /////////////////////////////////////////////////////////////////////
     * 
     * XXX 注意: 用户退场不需要指令, 因为是在断开服务器的时候执行
     * 
     * 结果
     * </pre>
     *
     * Protobuf type {@code msg.UserQuitResult}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msg.UserQuitResult)
        org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserQuitResult_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserQuitResult_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult.class, org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult.Builder.class);
      }

      // Construct using org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        quitUserId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserQuitResult_descriptor;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult getDefaultInstanceForType() {
        return org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult.getDefaultInstance();
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult build() {
        org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult buildPartial() {
        org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult result = new org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult(this);
        result.quitUserId_ = quitUserId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult) {
          return mergeFrom((org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult other) {
        if (other == org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult.getDefaultInstance()) return this;
        if (other.getQuitUserId() != 0) {
          setQuitUserId(other.getQuitUserId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int quitUserId_ ;
      /**
       * <pre>
       * 退出用户 Id
       * </pre>
       *
       * <code>uint32 quitUserId = 1;</code>
       * @return The quitUserId.
       */
      public int getQuitUserId() {
        return quitUserId_;
      }
      /**
       * <pre>
       * 退出用户 Id
       * </pre>
       *
       * <code>uint32 quitUserId = 1;</code>
       * @param value The quitUserId to set.
       * @return This builder for chaining.
       */
      public Builder setQuitUserId(int value) {
        
        quitUserId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 退出用户 Id
       * </pre>
       *
       * <code>uint32 quitUserId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearQuitUserId() {
        
        quitUserId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msg.UserQuitResult)
    }

    // @@protoc_insertion_point(class_scope:msg.UserQuitResult)
    private static final org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult();
    }

    public static org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UserQuitResult>
        PARSER = new com.google.protobuf.AbstractParser<UserQuitResult>() {
      @java.lang.Override
      public UserQuitResult parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UserQuitResult(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UserQuitResult> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UserQuitResult> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.tinygame.herostory.msg.GameMsgProtocol.UserQuitResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UserStopCmdOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msg.UserStopCmd)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   * 用户停驻
   * /////////////////////////////////////////////////////////////////////
   * 指令
   * </pre>
   *
   * Protobuf type {@code msg.UserStopCmd}
   */
  public  static final class UserStopCmd extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msg.UserStopCmd)
      UserStopCmdOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UserStopCmd.newBuilder() to construct.
    private UserStopCmd(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UserStopCmd() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UserStopCmd();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UserStopCmd(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserStopCmd_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserStopCmd_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd.class, org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd)) {
        return super.equals(obj);
      }
      org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd other = (org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd) obj;

      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 用户停驻
     * /////////////////////////////////////////////////////////////////////
     * 指令
     * </pre>
     *
     * Protobuf type {@code msg.UserStopCmd}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msg.UserStopCmd)
        org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmdOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserStopCmd_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserStopCmd_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd.class, org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd.Builder.class);
      }

      // Construct using org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserStopCmd_descriptor;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd getDefaultInstanceForType() {
        return org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd.getDefaultInstance();
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd build() {
        org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd buildPartial() {
        org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd result = new org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd(this);
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd) {
          return mergeFrom((org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd other) {
        if (other == org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msg.UserStopCmd)
    }

    // @@protoc_insertion_point(class_scope:msg.UserStopCmd)
    private static final org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd();
    }

    public static org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UserStopCmd>
        PARSER = new com.google.protobuf.AbstractParser<UserStopCmd>() {
      @java.lang.Override
      public UserStopCmd parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UserStopCmd(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UserStopCmd> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UserStopCmd> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.tinygame.herostory.msg.GameMsgProtocol.UserStopCmd getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UserStopResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msg.UserStopResult)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 停驻用户 Id
     * </pre>
     *
     * <code>uint32 stopUserId = 1;</code>
     * @return The stopUserId.
     */
    int getStopUserId();

    /**
     * <pre>
     * 停驻在位置 X
     * </pre>
     *
     * <code>float stopAtPosX = 2;</code>
     * @return The stopAtPosX.
     */
    float getStopAtPosX();

    /**
     * <pre>
     * 停驻在位置 Y
     * </pre>
     *
     * <code>float stopAtPosY = 3;</code>
     * @return The stopAtPosY.
     */
    float getStopAtPosY();
  }
  /**
   * <pre>
   * 结果
   * </pre>
   *
   * Protobuf type {@code msg.UserStopResult}
   */
  public  static final class UserStopResult extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msg.UserStopResult)
      UserStopResultOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UserStopResult.newBuilder() to construct.
    private UserStopResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UserStopResult() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UserStopResult();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UserStopResult(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              stopUserId_ = input.readUInt32();
              break;
            }
            case 21: {

              stopAtPosX_ = input.readFloat();
              break;
            }
            case 29: {

              stopAtPosY_ = input.readFloat();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserStopResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserStopResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult.class, org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult.Builder.class);
    }

    public static final int STOPUSERID_FIELD_NUMBER = 1;
    private int stopUserId_;
    /**
     * <pre>
     * 停驻用户 Id
     * </pre>
     *
     * <code>uint32 stopUserId = 1;</code>
     * @return The stopUserId.
     */
    public int getStopUserId() {
      return stopUserId_;
    }

    public static final int STOPATPOSX_FIELD_NUMBER = 2;
    private float stopAtPosX_;
    /**
     * <pre>
     * 停驻在位置 X
     * </pre>
     *
     * <code>float stopAtPosX = 2;</code>
     * @return The stopAtPosX.
     */
    public float getStopAtPosX() {
      return stopAtPosX_;
    }

    public static final int STOPATPOSY_FIELD_NUMBER = 3;
    private float stopAtPosY_;
    /**
     * <pre>
     * 停驻在位置 Y
     * </pre>
     *
     * <code>float stopAtPosY = 3;</code>
     * @return The stopAtPosY.
     */
    public float getStopAtPosY() {
      return stopAtPosY_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (stopUserId_ != 0) {
        output.writeUInt32(1, stopUserId_);
      }
      if (stopAtPosX_ != 0F) {
        output.writeFloat(2, stopAtPosX_);
      }
      if (stopAtPosY_ != 0F) {
        output.writeFloat(3, stopAtPosY_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (stopUserId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, stopUserId_);
      }
      if (stopAtPosX_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, stopAtPosX_);
      }
      if (stopAtPosY_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, stopAtPosY_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult)) {
        return super.equals(obj);
      }
      org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult other = (org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult) obj;

      if (getStopUserId()
          != other.getStopUserId()) return false;
      if (java.lang.Float.floatToIntBits(getStopAtPosX())
          != java.lang.Float.floatToIntBits(
              other.getStopAtPosX())) return false;
      if (java.lang.Float.floatToIntBits(getStopAtPosY())
          != java.lang.Float.floatToIntBits(
              other.getStopAtPosY())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + STOPUSERID_FIELD_NUMBER;
      hash = (53 * hash) + getStopUserId();
      hash = (37 * hash) + STOPATPOSX_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getStopAtPosX());
      hash = (37 * hash) + STOPATPOSY_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getStopAtPosY());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 结果
     * </pre>
     *
     * Protobuf type {@code msg.UserStopResult}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msg.UserStopResult)
        org.tinygame.herostory.msg.GameMsgProtocol.UserStopResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserStopResult_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserStopResult_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult.class, org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult.Builder.class);
      }

      // Construct using org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        stopUserId_ = 0;

        stopAtPosX_ = 0F;

        stopAtPosY_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserStopResult_descriptor;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult getDefaultInstanceForType() {
        return org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult.getDefaultInstance();
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult build() {
        org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult buildPartial() {
        org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult result = new org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult(this);
        result.stopUserId_ = stopUserId_;
        result.stopAtPosX_ = stopAtPosX_;
        result.stopAtPosY_ = stopAtPosY_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult) {
          return mergeFrom((org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult other) {
        if (other == org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult.getDefaultInstance()) return this;
        if (other.getStopUserId() != 0) {
          setStopUserId(other.getStopUserId());
        }
        if (other.getStopAtPosX() != 0F) {
          setStopAtPosX(other.getStopAtPosX());
        }
        if (other.getStopAtPosY() != 0F) {
          setStopAtPosY(other.getStopAtPosY());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int stopUserId_ ;
      /**
       * <pre>
       * 停驻用户 Id
       * </pre>
       *
       * <code>uint32 stopUserId = 1;</code>
       * @return The stopUserId.
       */
      public int getStopUserId() {
        return stopUserId_;
      }
      /**
       * <pre>
       * 停驻用户 Id
       * </pre>
       *
       * <code>uint32 stopUserId = 1;</code>
       * @param value The stopUserId to set.
       * @return This builder for chaining.
       */
      public Builder setStopUserId(int value) {
        
        stopUserId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 停驻用户 Id
       * </pre>
       *
       * <code>uint32 stopUserId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearStopUserId() {
        
        stopUserId_ = 0;
        onChanged();
        return this;
      }

      private float stopAtPosX_ ;
      /**
       * <pre>
       * 停驻在位置 X
       * </pre>
       *
       * <code>float stopAtPosX = 2;</code>
       * @return The stopAtPosX.
       */
      public float getStopAtPosX() {
        return stopAtPosX_;
      }
      /**
       * <pre>
       * 停驻在位置 X
       * </pre>
       *
       * <code>float stopAtPosX = 2;</code>
       * @param value The stopAtPosX to set.
       * @return This builder for chaining.
       */
      public Builder setStopAtPosX(float value) {
        
        stopAtPosX_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 停驻在位置 X
       * </pre>
       *
       * <code>float stopAtPosX = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearStopAtPosX() {
        
        stopAtPosX_ = 0F;
        onChanged();
        return this;
      }

      private float stopAtPosY_ ;
      /**
       * <pre>
       * 停驻在位置 Y
       * </pre>
       *
       * <code>float stopAtPosY = 3;</code>
       * @return The stopAtPosY.
       */
      public float getStopAtPosY() {
        return stopAtPosY_;
      }
      /**
       * <pre>
       * 停驻在位置 Y
       * </pre>
       *
       * <code>float stopAtPosY = 3;</code>
       * @param value The stopAtPosY to set.
       * @return This builder for chaining.
       */
      public Builder setStopAtPosY(float value) {
        
        stopAtPosY_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 停驻在位置 Y
       * </pre>
       *
       * <code>float stopAtPosY = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearStopAtPosY() {
        
        stopAtPosY_ = 0F;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msg.UserStopResult)
    }

    // @@protoc_insertion_point(class_scope:msg.UserStopResult)
    private static final org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult();
    }

    public static org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UserStopResult>
        PARSER = new com.google.protobuf.AbstractParser<UserStopResult>() {
      @java.lang.Override
      public UserStopResult parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UserStopResult(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UserStopResult> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UserStopResult> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.tinygame.herostory.msg.GameMsgProtocol.UserStopResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UserAttkCmdOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msg.UserAttkCmd)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 目标用户 Id
     * </pre>
     *
     * <code>uint32 targetUserId = 1;</code>
     * @return The targetUserId.
     */
    int getTargetUserId();
  }
  /**
   * <pre>
   * 用户攻击
   * /////////////////////////////////////////////////////////////////////
   * 指令
   * </pre>
   *
   * Protobuf type {@code msg.UserAttkCmd}
   */
  public  static final class UserAttkCmd extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msg.UserAttkCmd)
      UserAttkCmdOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UserAttkCmd.newBuilder() to construct.
    private UserAttkCmd(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UserAttkCmd() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UserAttkCmd();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UserAttkCmd(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              targetUserId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserAttkCmd_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserAttkCmd_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd.class, org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd.Builder.class);
    }

    public static final int TARGETUSERID_FIELD_NUMBER = 1;
    private int targetUserId_;
    /**
     * <pre>
     * 目标用户 Id
     * </pre>
     *
     * <code>uint32 targetUserId = 1;</code>
     * @return The targetUserId.
     */
    public int getTargetUserId() {
      return targetUserId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (targetUserId_ != 0) {
        output.writeUInt32(1, targetUserId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetUserId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, targetUserId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd)) {
        return super.equals(obj);
      }
      org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd other = (org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd) obj;

      if (getTargetUserId()
          != other.getTargetUserId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TARGETUSERID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUserId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 用户攻击
     * /////////////////////////////////////////////////////////////////////
     * 指令
     * </pre>
     *
     * Protobuf type {@code msg.UserAttkCmd}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msg.UserAttkCmd)
        org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmdOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserAttkCmd_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserAttkCmd_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd.class, org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd.Builder.class);
      }

      // Construct using org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        targetUserId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserAttkCmd_descriptor;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd getDefaultInstanceForType() {
        return org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd.getDefaultInstance();
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd build() {
        org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd buildPartial() {
        org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd result = new org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd(this);
        result.targetUserId_ = targetUserId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd) {
          return mergeFrom((org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd other) {
        if (other == org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd.getDefaultInstance()) return this;
        if (other.getTargetUserId() != 0) {
          setTargetUserId(other.getTargetUserId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int targetUserId_ ;
      /**
       * <pre>
       * 目标用户 Id
       * </pre>
       *
       * <code>uint32 targetUserId = 1;</code>
       * @return The targetUserId.
       */
      public int getTargetUserId() {
        return targetUserId_;
      }
      /**
       * <pre>
       * 目标用户 Id
       * </pre>
       *
       * <code>uint32 targetUserId = 1;</code>
       * @param value The targetUserId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUserId(int value) {
        
        targetUserId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 目标用户 Id
       * </pre>
       *
       * <code>uint32 targetUserId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUserId() {
        
        targetUserId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msg.UserAttkCmd)
    }

    // @@protoc_insertion_point(class_scope:msg.UserAttkCmd)
    private static final org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd();
    }

    public static org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UserAttkCmd>
        PARSER = new com.google.protobuf.AbstractParser<UserAttkCmd>() {
      @java.lang.Override
      public UserAttkCmd parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UserAttkCmd(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UserAttkCmd> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UserAttkCmd> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.tinygame.herostory.msg.GameMsgProtocol.UserAttkCmd getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UserAttkResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msg.UserAttkResult)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 发动攻击的用户 Id
     * </pre>
     *
     * <code>uint32 attkUserId = 1;</code>
     * @return The attkUserId.
     */
    int getAttkUserId();

    /**
     * <pre>
     * 目标用户 Id
     * </pre>
     *
     * <code>uint32 targetUserId = 2;</code>
     * @return The targetUserId.
     */
    int getTargetUserId();
  }
  /**
   * <pre>
   * 结果
   * </pre>
   *
   * Protobuf type {@code msg.UserAttkResult}
   */
  public  static final class UserAttkResult extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msg.UserAttkResult)
      UserAttkResultOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UserAttkResult.newBuilder() to construct.
    private UserAttkResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UserAttkResult() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UserAttkResult();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UserAttkResult(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              attkUserId_ = input.readUInt32();
              break;
            }
            case 16: {

              targetUserId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserAttkResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserAttkResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult.class, org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult.Builder.class);
    }

    public static final int ATTKUSERID_FIELD_NUMBER = 1;
    private int attkUserId_;
    /**
     * <pre>
     * 发动攻击的用户 Id
     * </pre>
     *
     * <code>uint32 attkUserId = 1;</code>
     * @return The attkUserId.
     */
    public int getAttkUserId() {
      return attkUserId_;
    }

    public static final int TARGETUSERID_FIELD_NUMBER = 2;
    private int targetUserId_;
    /**
     * <pre>
     * 目标用户 Id
     * </pre>
     *
     * <code>uint32 targetUserId = 2;</code>
     * @return The targetUserId.
     */
    public int getTargetUserId() {
      return targetUserId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (attkUserId_ != 0) {
        output.writeUInt32(1, attkUserId_);
      }
      if (targetUserId_ != 0) {
        output.writeUInt32(2, targetUserId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (attkUserId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, attkUserId_);
      }
      if (targetUserId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, targetUserId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult)) {
        return super.equals(obj);
      }
      org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult other = (org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult) obj;

      if (getAttkUserId()
          != other.getAttkUserId()) return false;
      if (getTargetUserId()
          != other.getTargetUserId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ATTKUSERID_FIELD_NUMBER;
      hash = (53 * hash) + getAttkUserId();
      hash = (37 * hash) + TARGETUSERID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUserId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 结果
     * </pre>
     *
     * Protobuf type {@code msg.UserAttkResult}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msg.UserAttkResult)
        org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserAttkResult_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserAttkResult_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult.class, org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult.Builder.class);
      }

      // Construct using org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        attkUserId_ = 0;

        targetUserId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserAttkResult_descriptor;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult getDefaultInstanceForType() {
        return org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult.getDefaultInstance();
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult build() {
        org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult buildPartial() {
        org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult result = new org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult(this);
        result.attkUserId_ = attkUserId_;
        result.targetUserId_ = targetUserId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult) {
          return mergeFrom((org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult other) {
        if (other == org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult.getDefaultInstance()) return this;
        if (other.getAttkUserId() != 0) {
          setAttkUserId(other.getAttkUserId());
        }
        if (other.getTargetUserId() != 0) {
          setTargetUserId(other.getTargetUserId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int attkUserId_ ;
      /**
       * <pre>
       * 发动攻击的用户 Id
       * </pre>
       *
       * <code>uint32 attkUserId = 1;</code>
       * @return The attkUserId.
       */
      public int getAttkUserId() {
        return attkUserId_;
      }
      /**
       * <pre>
       * 发动攻击的用户 Id
       * </pre>
       *
       * <code>uint32 attkUserId = 1;</code>
       * @param value The attkUserId to set.
       * @return This builder for chaining.
       */
      public Builder setAttkUserId(int value) {
        
        attkUserId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 发动攻击的用户 Id
       * </pre>
       *
       * <code>uint32 attkUserId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAttkUserId() {
        
        attkUserId_ = 0;
        onChanged();
        return this;
      }

      private int targetUserId_ ;
      /**
       * <pre>
       * 目标用户 Id
       * </pre>
       *
       * <code>uint32 targetUserId = 2;</code>
       * @return The targetUserId.
       */
      public int getTargetUserId() {
        return targetUserId_;
      }
      /**
       * <pre>
       * 目标用户 Id
       * </pre>
       *
       * <code>uint32 targetUserId = 2;</code>
       * @param value The targetUserId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUserId(int value) {
        
        targetUserId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 目标用户 Id
       * </pre>
       *
       * <code>uint32 targetUserId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUserId() {
        
        targetUserId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msg.UserAttkResult)
    }

    // @@protoc_insertion_point(class_scope:msg.UserAttkResult)
    private static final org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult();
    }

    public static org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UserAttkResult>
        PARSER = new com.google.protobuf.AbstractParser<UserAttkResult>() {
      @java.lang.Override
      public UserAttkResult parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UserAttkResult(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UserAttkResult> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UserAttkResult> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.tinygame.herostory.msg.GameMsgProtocol.UserAttkResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UserSubtractHpResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msg.UserSubtractHpResult)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 目标用户 Id
     * </pre>
     *
     * <code>uint32 targetUserId = 1;</code>
     * @return The targetUserId.
     */
    int getTargetUserId();

    /**
     * <pre>
     * 减血量
     * </pre>
     *
     * <code>uint32 subtractHp = 2;</code>
     * @return The subtractHp.
     */
    int getSubtractHp();
  }
  /**
   * <pre>
   * 用户减血结果
   * </pre>
   *
   * Protobuf type {@code msg.UserSubtractHpResult}
   */
  public  static final class UserSubtractHpResult extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msg.UserSubtractHpResult)
      UserSubtractHpResultOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UserSubtractHpResult.newBuilder() to construct.
    private UserSubtractHpResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UserSubtractHpResult() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UserSubtractHpResult();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UserSubtractHpResult(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              targetUserId_ = input.readUInt32();
              break;
            }
            case 16: {

              subtractHp_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserSubtractHpResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserSubtractHpResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult.class, org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult.Builder.class);
    }

    public static final int TARGETUSERID_FIELD_NUMBER = 1;
    private int targetUserId_;
    /**
     * <pre>
     * 目标用户 Id
     * </pre>
     *
     * <code>uint32 targetUserId = 1;</code>
     * @return The targetUserId.
     */
    public int getTargetUserId() {
      return targetUserId_;
    }

    public static final int SUBTRACTHP_FIELD_NUMBER = 2;
    private int subtractHp_;
    /**
     * <pre>
     * 减血量
     * </pre>
     *
     * <code>uint32 subtractHp = 2;</code>
     * @return The subtractHp.
     */
    public int getSubtractHp() {
      return subtractHp_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (targetUserId_ != 0) {
        output.writeUInt32(1, targetUserId_);
      }
      if (subtractHp_ != 0) {
        output.writeUInt32(2, subtractHp_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetUserId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, targetUserId_);
      }
      if (subtractHp_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, subtractHp_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult)) {
        return super.equals(obj);
      }
      org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult other = (org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult) obj;

      if (getTargetUserId()
          != other.getTargetUserId()) return false;
      if (getSubtractHp()
          != other.getSubtractHp()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TARGETUSERID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUserId();
      hash = (37 * hash) + SUBTRACTHP_FIELD_NUMBER;
      hash = (53 * hash) + getSubtractHp();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 用户减血结果
     * </pre>
     *
     * Protobuf type {@code msg.UserSubtractHpResult}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msg.UserSubtractHpResult)
        org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserSubtractHpResult_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserSubtractHpResult_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult.class, org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult.Builder.class);
      }

      // Construct using org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        targetUserId_ = 0;

        subtractHp_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserSubtractHpResult_descriptor;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult getDefaultInstanceForType() {
        return org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult.getDefaultInstance();
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult build() {
        org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult buildPartial() {
        org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult result = new org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult(this);
        result.targetUserId_ = targetUserId_;
        result.subtractHp_ = subtractHp_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult) {
          return mergeFrom((org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult other) {
        if (other == org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult.getDefaultInstance()) return this;
        if (other.getTargetUserId() != 0) {
          setTargetUserId(other.getTargetUserId());
        }
        if (other.getSubtractHp() != 0) {
          setSubtractHp(other.getSubtractHp());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int targetUserId_ ;
      /**
       * <pre>
       * 目标用户 Id
       * </pre>
       *
       * <code>uint32 targetUserId = 1;</code>
       * @return The targetUserId.
       */
      public int getTargetUserId() {
        return targetUserId_;
      }
      /**
       * <pre>
       * 目标用户 Id
       * </pre>
       *
       * <code>uint32 targetUserId = 1;</code>
       * @param value The targetUserId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUserId(int value) {
        
        targetUserId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 目标用户 Id
       * </pre>
       *
       * <code>uint32 targetUserId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUserId() {
        
        targetUserId_ = 0;
        onChanged();
        return this;
      }

      private int subtractHp_ ;
      /**
       * <pre>
       * 减血量
       * </pre>
       *
       * <code>uint32 subtractHp = 2;</code>
       * @return The subtractHp.
       */
      public int getSubtractHp() {
        return subtractHp_;
      }
      /**
       * <pre>
       * 减血量
       * </pre>
       *
       * <code>uint32 subtractHp = 2;</code>
       * @param value The subtractHp to set.
       * @return This builder for chaining.
       */
      public Builder setSubtractHp(int value) {
        
        subtractHp_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 减血量
       * </pre>
       *
       * <code>uint32 subtractHp = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSubtractHp() {
        
        subtractHp_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msg.UserSubtractHpResult)
    }

    // @@protoc_insertion_point(class_scope:msg.UserSubtractHpResult)
    private static final org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult();
    }

    public static org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UserSubtractHpResult>
        PARSER = new com.google.protobuf.AbstractParser<UserSubtractHpResult>() {
      @java.lang.Override
      public UserSubtractHpResult parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UserSubtractHpResult(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UserSubtractHpResult> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UserSubtractHpResult> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.tinygame.herostory.msg.GameMsgProtocol.UserSubtractHpResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UserDieResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:msg.UserDieResult)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 目标用户 Id
     * </pre>
     *
     * <code>uint32 targetUserId = 1;</code>
     * @return The targetUserId.
     */
    int getTargetUserId();
  }
  /**
   * <pre>
   * 死亡结果
   * </pre>
   *
   * Protobuf type {@code msg.UserDieResult}
   */
  public  static final class UserDieResult extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:msg.UserDieResult)
      UserDieResultOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UserDieResult.newBuilder() to construct.
    private UserDieResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UserDieResult() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UserDieResult();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UserDieResult(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              targetUserId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserDieResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserDieResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult.class, org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult.Builder.class);
    }

    public static final int TARGETUSERID_FIELD_NUMBER = 1;
    private int targetUserId_;
    /**
     * <pre>
     * 目标用户 Id
     * </pre>
     *
     * <code>uint32 targetUserId = 1;</code>
     * @return The targetUserId.
     */
    public int getTargetUserId() {
      return targetUserId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (targetUserId_ != 0) {
        output.writeUInt32(1, targetUserId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetUserId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, targetUserId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult)) {
        return super.equals(obj);
      }
      org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult other = (org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult) obj;

      if (getTargetUserId()
          != other.getTargetUserId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TARGETUSERID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUserId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 死亡结果
     * </pre>
     *
     * Protobuf type {@code msg.UserDieResult}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:msg.UserDieResult)
        org.tinygame.herostory.msg.GameMsgProtocol.UserDieResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserDieResult_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserDieResult_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult.class, org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult.Builder.class);
      }

      // Construct using org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        targetUserId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.tinygame.herostory.msg.GameMsgProtocol.internal_static_msg_UserDieResult_descriptor;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult getDefaultInstanceForType() {
        return org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult.getDefaultInstance();
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult build() {
        org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult buildPartial() {
        org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult result = new org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult(this);
        result.targetUserId_ = targetUserId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult) {
          return mergeFrom((org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult other) {
        if (other == org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult.getDefaultInstance()) return this;
        if (other.getTargetUserId() != 0) {
          setTargetUserId(other.getTargetUserId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int targetUserId_ ;
      /**
       * <pre>
       * 目标用户 Id
       * </pre>
       *
       * <code>uint32 targetUserId = 1;</code>
       * @return The targetUserId.
       */
      public int getTargetUserId() {
        return targetUserId_;
      }
      /**
       * <pre>
       * 目标用户 Id
       * </pre>
       *
       * <code>uint32 targetUserId = 1;</code>
       * @param value The targetUserId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUserId(int value) {
        
        targetUserId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 目标用户 Id
       * </pre>
       *
       * <code>uint32 targetUserId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUserId() {
        
        targetUserId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:msg.UserDieResult)
    }

    // @@protoc_insertion_point(class_scope:msg.UserDieResult)
    private static final org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult();
    }

    public static org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UserDieResult>
        PARSER = new com.google.protobuf.AbstractParser<UserDieResult>() {
      @java.lang.Override
      public UserDieResult parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UserDieResult(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UserDieResult> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UserDieResult> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.tinygame.herostory.msg.GameMsgProtocol.UserDieResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_UserEntryCmd_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msg_UserEntryCmd_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_UserEntryResult_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msg_UserEntryResult_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_WhoElseIsHereCmd_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msg_WhoElseIsHereCmd_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_WhoElseIsHereResult_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msg_WhoElseIsHereResult_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_WhoElseIsHereResult_UserInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msg_WhoElseIsHereResult_UserInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_UserMoveToCmd_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msg_UserMoveToCmd_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_UserMoveToResult_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msg_UserMoveToResult_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_UserQuitResult_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msg_UserQuitResult_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_UserStopCmd_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msg_UserStopCmd_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_UserStopResult_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msg_UserStopResult_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_UserAttkCmd_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msg_UserAttkCmd_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_UserAttkResult_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msg_UserAttkResult_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_UserSubtractHpResult_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msg_UserSubtractHpResult_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_UserDieResult_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_msg_UserDieResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025GameMsgProtocol.proto\022\003msg\"2\n\014UserEntr" +
      "yCmd\022\016\n\006userId\030\001 \001(\r\022\022\n\nheroAvatar\030\002 \001(\t" +
      "\"5\n\017UserEntryResult\022\016\n\006userId\030\001 \001(\r\022\022\n\nh" +
      "eroAvatar\030\002 \001(\t\"\022\n\020WhoElseIsHereCmd\"z\n\023W" +
      "hoElseIsHereResult\0223\n\010userInfo\030\001 \003(\0132!.m" +
      "sg.WhoElseIsHereResult.UserInfo\032.\n\010UserI" +
      "nfo\022\016\n\006userId\030\001 \001(\r\022\022\n\nheroAvatar\030\002 \001(\t\"" +
      "7\n\rUserMoveToCmd\022\022\n\nmoveToPosX\030\001 \001(\002\022\022\n\n" +
      "moveToPosY\030\002 \001(\002\"N\n\020UserMoveToResult\022\022\n\n" +
      "moveUserId\030\001 \001(\r\022\022\n\nmoveToPosX\030\002 \001(\002\022\022\n\n" +
      "moveToPosY\030\003 \001(\002\"$\n\016UserQuitResult\022\022\n\nqu" +
      "itUserId\030\001 \001(\r\"\r\n\013UserStopCmd\"L\n\016UserSto" +
      "pResult\022\022\n\nstopUserId\030\001 \001(\r\022\022\n\nstopAtPos" +
      "X\030\002 \001(\002\022\022\n\nstopAtPosY\030\003 \001(\002\"#\n\013UserAttkC" +
      "md\022\024\n\014targetUserId\030\001 \001(\r\":\n\016UserAttkResu" +
      "lt\022\022\n\nattkUserId\030\001 \001(\r\022\024\n\014targetUserId\030\002" +
      " \001(\r\"@\n\024UserSubtractHpResult\022\024\n\014targetUs" +
      "erId\030\001 \001(\r\022\022\n\nsubtractHp\030\002 \001(\r\"%\n\rUserDi" +
      "eResult\022\024\n\014targetUserId\030\001 \001(\r*\264\002\n\007MsgCod" +
      "e\022\022\n\016USER_ENTRY_CMD\020\000\022\025\n\021USER_ENTRY_RESU" +
      "LT\020\001\022\030\n\024WHO_ELSE_IS_HERE_CMD\020\002\022\033\n\027WHO_EL" +
      "SE_IS_HERE_RESULT\020\003\022\024\n\020USER_MOVE_TO_CMD\020" +
      "\004\022\027\n\023USER_MOVE_TO_RESULT\020\005\022\024\n\020USER_QUIT_" +
      "RESULT\020\006\022\021\n\rUSER_STOP_CMD\020\007\022\024\n\020USER_STOP" +
      "_RESULT\020\010\022\021\n\rUSER_ATTK_CMD\020\t\022\024\n\020USER_ATT" +
      "K_RESULT\020\n\022\033\n\027USER_SUBTRACT_HP_RESULT\020\013\022" +
      "\023\n\017USER_DIE_RESULT\020\014B\034\n\032org.tinygame.her" +
      "ostory.msgb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_msg_UserEntryCmd_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_msg_UserEntryCmd_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msg_UserEntryCmd_descriptor,
        new java.lang.String[] { "UserId", "HeroAvatar", });
    internal_static_msg_UserEntryResult_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_msg_UserEntryResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msg_UserEntryResult_descriptor,
        new java.lang.String[] { "UserId", "HeroAvatar", });
    internal_static_msg_WhoElseIsHereCmd_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_msg_WhoElseIsHereCmd_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msg_WhoElseIsHereCmd_descriptor,
        new java.lang.String[] { });
    internal_static_msg_WhoElseIsHereResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_msg_WhoElseIsHereResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msg_WhoElseIsHereResult_descriptor,
        new java.lang.String[] { "UserInfo", });
    internal_static_msg_WhoElseIsHereResult_UserInfo_descriptor =
      internal_static_msg_WhoElseIsHereResult_descriptor.getNestedTypes().get(0);
    internal_static_msg_WhoElseIsHereResult_UserInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msg_WhoElseIsHereResult_UserInfo_descriptor,
        new java.lang.String[] { "UserId", "HeroAvatar", });
    internal_static_msg_UserMoveToCmd_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_msg_UserMoveToCmd_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msg_UserMoveToCmd_descriptor,
        new java.lang.String[] { "MoveToPosX", "MoveToPosY", });
    internal_static_msg_UserMoveToResult_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_msg_UserMoveToResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msg_UserMoveToResult_descriptor,
        new java.lang.String[] { "MoveUserId", "MoveToPosX", "MoveToPosY", });
    internal_static_msg_UserQuitResult_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_msg_UserQuitResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msg_UserQuitResult_descriptor,
        new java.lang.String[] { "QuitUserId", });
    internal_static_msg_UserStopCmd_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_msg_UserStopCmd_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msg_UserStopCmd_descriptor,
        new java.lang.String[] { });
    internal_static_msg_UserStopResult_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_msg_UserStopResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msg_UserStopResult_descriptor,
        new java.lang.String[] { "StopUserId", "StopAtPosX", "StopAtPosY", });
    internal_static_msg_UserAttkCmd_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_msg_UserAttkCmd_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msg_UserAttkCmd_descriptor,
        new java.lang.String[] { "TargetUserId", });
    internal_static_msg_UserAttkResult_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_msg_UserAttkResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msg_UserAttkResult_descriptor,
        new java.lang.String[] { "AttkUserId", "TargetUserId", });
    internal_static_msg_UserSubtractHpResult_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_msg_UserSubtractHpResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msg_UserSubtractHpResult_descriptor,
        new java.lang.String[] { "TargetUserId", "SubtractHp", });
    internal_static_msg_UserDieResult_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_msg_UserDieResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_msg_UserDieResult_descriptor,
        new java.lang.String[] { "TargetUserId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
