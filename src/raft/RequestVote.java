// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RequestVote.proto

package raft;

public final class RequestVote {
  private RequestVote() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CandidateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:raft.Candidate)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 Term = 1;</code>
     */
    boolean hasTerm();
    /**
     * <code>required int32 Term = 1;</code>
     */
    int getTerm();

    /**
     * <code>required int32 CandidateId = 2;</code>
     */
    boolean hasCandidateId();
    /**
     * <code>required int32 CandidateId = 2;</code>
     */
    int getCandidateId();

    /**
     * <code>required int32 LastLogIndex = 3;</code>
     */
    boolean hasLastLogIndex();
    /**
     * <code>required int32 LastLogIndex = 3;</code>
     */
    int getLastLogIndex();

    /**
     * <code>required int32 LastLogTerm = 4;</code>
     */
    boolean hasLastLogTerm();
    /**
     * <code>required int32 LastLogTerm = 4;</code>
     */
    int getLastLogTerm();
  }
  /**
   * Protobuf type {@code raft.Candidate}
   */
  public  static final class Candidate extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:raft.Candidate)
      CandidateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Candidate.newBuilder() to construct.
    private Candidate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Candidate() {
      term_ = 0;
      candidateId_ = 0;
      lastLogIndex_ = 0;
      lastLogTerm_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Candidate(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              term_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              candidateId_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              lastLogIndex_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              lastLogTerm_ = input.readInt32();
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
      return raft.RequestVote.internal_static_raft_Candidate_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return raft.RequestVote.internal_static_raft_Candidate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              raft.RequestVote.Candidate.class, raft.RequestVote.Candidate.Builder.class);
    }

    private int bitField0_;
    public static final int TERM_FIELD_NUMBER = 1;
    private int term_;
    /**
     * <code>required int32 Term = 1;</code>
     */
    public boolean hasTerm() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 Term = 1;</code>
     */
    public int getTerm() {
      return term_;
    }

    public static final int CANDIDATEID_FIELD_NUMBER = 2;
    private int candidateId_;
    /**
     * <code>required int32 CandidateId = 2;</code>
     */
    public boolean hasCandidateId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 CandidateId = 2;</code>
     */
    public int getCandidateId() {
      return candidateId_;
    }

    public static final int LASTLOGINDEX_FIELD_NUMBER = 3;
    private int lastLogIndex_;
    /**
     * <code>required int32 LastLogIndex = 3;</code>
     */
    public boolean hasLastLogIndex() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 LastLogIndex = 3;</code>
     */
    public int getLastLogIndex() {
      return lastLogIndex_;
    }

    public static final int LASTLOGTERM_FIELD_NUMBER = 4;
    private int lastLogTerm_;
    /**
     * <code>required int32 LastLogTerm = 4;</code>
     */
    public boolean hasLastLogTerm() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required int32 LastLogTerm = 4;</code>
     */
    public int getLastLogTerm() {
      return lastLogTerm_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasTerm()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCandidateId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLastLogIndex()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLastLogTerm()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, term_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, candidateId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, lastLogIndex_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, lastLogTerm_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, term_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, candidateId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, lastLogIndex_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, lastLogTerm_);
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
      if (!(obj instanceof raft.RequestVote.Candidate)) {
        return super.equals(obj);
      }
      raft.RequestVote.Candidate other = (raft.RequestVote.Candidate) obj;

      boolean result = true;
      result = result && (hasTerm() == other.hasTerm());
      if (hasTerm()) {
        result = result && (getTerm()
            == other.getTerm());
      }
      result = result && (hasCandidateId() == other.hasCandidateId());
      if (hasCandidateId()) {
        result = result && (getCandidateId()
            == other.getCandidateId());
      }
      result = result && (hasLastLogIndex() == other.hasLastLogIndex());
      if (hasLastLogIndex()) {
        result = result && (getLastLogIndex()
            == other.getLastLogIndex());
      }
      result = result && (hasLastLogTerm() == other.hasLastLogTerm());
      if (hasLastLogTerm()) {
        result = result && (getLastLogTerm()
            == other.getLastLogTerm());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasTerm()) {
        hash = (37 * hash) + TERM_FIELD_NUMBER;
        hash = (53 * hash) + getTerm();
      }
      if (hasCandidateId()) {
        hash = (37 * hash) + CANDIDATEID_FIELD_NUMBER;
        hash = (53 * hash) + getCandidateId();
      }
      if (hasLastLogIndex()) {
        hash = (37 * hash) + LASTLOGINDEX_FIELD_NUMBER;
        hash = (53 * hash) + getLastLogIndex();
      }
      if (hasLastLogTerm()) {
        hash = (37 * hash) + LASTLOGTERM_FIELD_NUMBER;
        hash = (53 * hash) + getLastLogTerm();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static raft.RequestVote.Candidate parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static raft.RequestVote.Candidate parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static raft.RequestVote.Candidate parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static raft.RequestVote.Candidate parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static raft.RequestVote.Candidate parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static raft.RequestVote.Candidate parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static raft.RequestVote.Candidate parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static raft.RequestVote.Candidate parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static raft.RequestVote.Candidate parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static raft.RequestVote.Candidate parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static raft.RequestVote.Candidate parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static raft.RequestVote.Candidate parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(raft.RequestVote.Candidate prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code raft.Candidate}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:raft.Candidate)
        raft.RequestVote.CandidateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return raft.RequestVote.internal_static_raft_Candidate_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return raft.RequestVote.internal_static_raft_Candidate_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                raft.RequestVote.Candidate.class, raft.RequestVote.Candidate.Builder.class);
      }

      // Construct using raft.RequestVote.Candidate.newBuilder()
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
      public Builder clear() {
        super.clear();
        term_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        candidateId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        lastLogIndex_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        lastLogTerm_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return raft.RequestVote.internal_static_raft_Candidate_descriptor;
      }

      public raft.RequestVote.Candidate getDefaultInstanceForType() {
        return raft.RequestVote.Candidate.getDefaultInstance();
      }

      public raft.RequestVote.Candidate build() {
        raft.RequestVote.Candidate result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public raft.RequestVote.Candidate buildPartial() {
        raft.RequestVote.Candidate result = new raft.RequestVote.Candidate(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.term_ = term_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.candidateId_ = candidateId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.lastLogIndex_ = lastLogIndex_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.lastLogTerm_ = lastLogTerm_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof raft.RequestVote.Candidate) {
          return mergeFrom((raft.RequestVote.Candidate)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(raft.RequestVote.Candidate other) {
        if (other == raft.RequestVote.Candidate.getDefaultInstance()) return this;
        if (other.hasTerm()) {
          setTerm(other.getTerm());
        }
        if (other.hasCandidateId()) {
          setCandidateId(other.getCandidateId());
        }
        if (other.hasLastLogIndex()) {
          setLastLogIndex(other.getLastLogIndex());
        }
        if (other.hasLastLogTerm()) {
          setLastLogTerm(other.getLastLogTerm());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTerm()) {
          return false;
        }
        if (!hasCandidateId()) {
          return false;
        }
        if (!hasLastLogIndex()) {
          return false;
        }
        if (!hasLastLogTerm()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        raft.RequestVote.Candidate parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (raft.RequestVote.Candidate) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int term_ ;
      /**
       * <code>required int32 Term = 1;</code>
       */
      public boolean hasTerm() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 Term = 1;</code>
       */
      public int getTerm() {
        return term_;
      }
      /**
       * <code>required int32 Term = 1;</code>
       */
      public Builder setTerm(int value) {
        bitField0_ |= 0x00000001;
        term_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 Term = 1;</code>
       */
      public Builder clearTerm() {
        bitField0_ = (bitField0_ & ~0x00000001);
        term_ = 0;
        onChanged();
        return this;
      }

      private int candidateId_ ;
      /**
       * <code>required int32 CandidateId = 2;</code>
       */
      public boolean hasCandidateId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 CandidateId = 2;</code>
       */
      public int getCandidateId() {
        return candidateId_;
      }
      /**
       * <code>required int32 CandidateId = 2;</code>
       */
      public Builder setCandidateId(int value) {
        bitField0_ |= 0x00000002;
        candidateId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 CandidateId = 2;</code>
       */
      public Builder clearCandidateId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        candidateId_ = 0;
        onChanged();
        return this;
      }

      private int lastLogIndex_ ;
      /**
       * <code>required int32 LastLogIndex = 3;</code>
       */
      public boolean hasLastLogIndex() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 LastLogIndex = 3;</code>
       */
      public int getLastLogIndex() {
        return lastLogIndex_;
      }
      /**
       * <code>required int32 LastLogIndex = 3;</code>
       */
      public Builder setLastLogIndex(int value) {
        bitField0_ |= 0x00000004;
        lastLogIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 LastLogIndex = 3;</code>
       */
      public Builder clearLastLogIndex() {
        bitField0_ = (bitField0_ & ~0x00000004);
        lastLogIndex_ = 0;
        onChanged();
        return this;
      }

      private int lastLogTerm_ ;
      /**
       * <code>required int32 LastLogTerm = 4;</code>
       */
      public boolean hasLastLogTerm() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required int32 LastLogTerm = 4;</code>
       */
      public int getLastLogTerm() {
        return lastLogTerm_;
      }
      /**
       * <code>required int32 LastLogTerm = 4;</code>
       */
      public Builder setLastLogTerm(int value) {
        bitField0_ |= 0x00000008;
        lastLogTerm_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 LastLogTerm = 4;</code>
       */
      public Builder clearLastLogTerm() {
        bitField0_ = (bitField0_ & ~0x00000008);
        lastLogTerm_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:raft.Candidate)
    }

    // @@protoc_insertion_point(class_scope:raft.Candidate)
    private static final raft.RequestVote.Candidate DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new raft.RequestVote.Candidate();
    }

    public static raft.RequestVote.Candidate getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Candidate>
        PARSER = new com.google.protobuf.AbstractParser<Candidate>() {
      public Candidate parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Candidate(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Candidate> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Candidate> getParserForType() {
      return PARSER;
    }

    public raft.RequestVote.Candidate getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_raft_Candidate_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_raft_Candidate_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021RequestVote.proto\022\004raft\032\037google/protob" +
      "uf/timestamp.proto\"Y\n\tCandidate\022\014\n\004Term\030" +
      "\001 \002(\005\022\023\n\013CandidateId\030\002 \002(\005\022\024\n\014LastLogInd" +
      "ex\030\003 \002(\005\022\023\n\013LastLogTerm\030\004 \002(\005B\023\n\004raftB\013R" +
      "equestVote"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_raft_Candidate_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_raft_Candidate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_raft_Candidate_descriptor,
        new java.lang.String[] { "Term", "CandidateId", "LastLogIndex", "LastLogTerm", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
