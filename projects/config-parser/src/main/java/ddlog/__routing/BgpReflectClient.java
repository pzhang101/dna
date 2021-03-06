// automatically generated by the FlatBuffers compiler, do not modify

package ddlog.__routing;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class BgpReflectClient extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static BgpReflectClient getRootAsBgpReflectClient(ByteBuffer _bb) { return getRootAsBgpReflectClient(_bb, new BgpReflectClient()); }
  public static BgpReflectClient getRootAsBgpReflectClient(ByteBuffer _bb, BgpReflectClient obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public BgpReflectClient __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public ddlog.__routing.vnode_t node1() { return node1(new ddlog.__routing.vnode_t()); }
  public ddlog.__routing.vnode_t node1(ddlog.__routing.vnode_t obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public ddlog.__routing.ip_t ip1() { return ip1(new ddlog.__routing.ip_t()); }
  public ddlog.__routing.ip_t ip1(ddlog.__routing.ip_t obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public ddlog.__routing.vnode_t node2() { return node2(new ddlog.__routing.vnode_t()); }
  public ddlog.__routing.vnode_t node2(ddlog.__routing.vnode_t obj) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public ddlog.__routing.ip_t ip2() { return ip2(new ddlog.__routing.ip_t()); }
  public ddlog.__routing.ip_t ip2(ddlog.__routing.ip_t obj) { int o = __offset(10); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createBgpReflectClient(FlatBufferBuilder builder,
      int node1Offset,
      int ip1Offset,
      int node2Offset,
      int ip2Offset) {
    builder.startTable(4);
    BgpReflectClient.addIp2(builder, ip2Offset);
    BgpReflectClient.addNode2(builder, node2Offset);
    BgpReflectClient.addIp1(builder, ip1Offset);
    BgpReflectClient.addNode1(builder, node1Offset);
    return BgpReflectClient.endBgpReflectClient(builder);
  }

  public static void startBgpReflectClient(FlatBufferBuilder builder) { builder.startTable(4); }
  public static void addNode1(FlatBufferBuilder builder, int node1Offset) { builder.addOffset(0, node1Offset, 0); }
  public static void addIp1(FlatBufferBuilder builder, int ip1Offset) { builder.addOffset(1, ip1Offset, 0); }
  public static void addNode2(FlatBufferBuilder builder, int node2Offset) { builder.addOffset(2, node2Offset, 0); }
  public static void addIp2(FlatBufferBuilder builder, int ip2Offset) { builder.addOffset(3, ip2Offset, 0); }
  public static int endBgpReflectClient(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public BgpReflectClient get(int j) { return get(new BgpReflectClient(), j); }
    public BgpReflectClient get(BgpReflectClient obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

