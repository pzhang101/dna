// automatically generated by the FlatBuffers compiler, do not modify

package ddlog.__routing;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Node extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static Node getRootAsNode(ByteBuffer _bb) { return getRootAsNode(_bb, new Node()); }
  public static Node getRootAsNode(ByteBuffer _bb, Node obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Node __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public ddlog.__routing.vnode_t node() { return node(new ddlog.__routing.vnode_t()); }
  public ddlog.__routing.vnode_t node(ddlog.__routing.vnode_t obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public long as_() { int o = __offset(6); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public long id() { int o = __offset(8); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }

  public static int createNode(FlatBufferBuilder builder,
      int nodeOffset,
      long as_,
      long id) {
    builder.startTable(3);
    Node.addId(builder, id);
    Node.addAs_(builder, as_);
    Node.addNode(builder, nodeOffset);
    return Node.endNode(builder);
  }

  public static void startNode(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addNode(FlatBufferBuilder builder, int nodeOffset) { builder.addOffset(0, nodeOffset, 0); }
  public static void addAs_(FlatBufferBuilder builder, long as_) { builder.addLong(1, as_, 0L); }
  public static void addId(FlatBufferBuilder builder, long id) { builder.addLong(2, id, 0L); }
  public static int endNode(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Node get(int j) { return get(new Node(), j); }
    public Node get(Node obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

