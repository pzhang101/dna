// automatically generated by the FlatBuffers compiler, do not modify

package ddlog.__routing;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class BgpAggregation extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static BgpAggregation getRootAsBgpAggregation(ByteBuffer _bb) { return getRootAsBgpAggregation(_bb, new BgpAggregation()); }
  public static BgpAggregation getRootAsBgpAggregation(ByteBuffer _bb, BgpAggregation obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public BgpAggregation __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public ddlog.__routing.vnode_t node() { return node(new ddlog.__routing.vnode_t()); }
  public ddlog.__routing.vnode_t node(ddlog.__routing.vnode_t obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public ddlog.__routing.prefix_t prefix() { return prefix(new ddlog.__routing.prefix_t()); }
  public ddlog.__routing.prefix_t prefix(ddlog.__routing.prefix_t obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createBgpAggregation(FlatBufferBuilder builder,
      int nodeOffset,
      int prefixOffset) {
    builder.startTable(2);
    BgpAggregation.addPrefix(builder, prefixOffset);
    BgpAggregation.addNode(builder, nodeOffset);
    return BgpAggregation.endBgpAggregation(builder);
  }

  public static void startBgpAggregation(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addNode(FlatBufferBuilder builder, int nodeOffset) { builder.addOffset(0, nodeOffset, 0); }
  public static void addPrefix(FlatBufferBuilder builder, int prefixOffset) { builder.addOffset(1, prefixOffset, 0); }
  public static int endBgpAggregation(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public BgpAggregation get(int j) { return get(new BgpAggregation(), j); }
    public BgpAggregation get(BgpAggregation obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

