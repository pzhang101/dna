// automatically generated by the FlatBuffers compiler, do not modify

package ddlog.__routing;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class prefix_t extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static prefix_t getRootAsprefix_t(ByteBuffer _bb) { return getRootAsprefix_t(_bb, new prefix_t()); }
  public static prefix_t getRootAsprefix_t(ByteBuffer _bb, prefix_t obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public prefix_t __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public ddlog.__routing.ip_t addr() { return addr(new ddlog.__routing.ip_t()); }
  public ddlog.__routing.ip_t addr(ddlog.__routing.ip_t obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public ddlog.__routing.ip_t mask() { return mask(new ddlog.__routing.ip_t()); }
  public ddlog.__routing.ip_t mask(ddlog.__routing.ip_t obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createprefix_t(FlatBufferBuilder builder,
      int addrOffset,
      int maskOffset) {
    builder.startTable(2);
    prefix_t.addMask(builder, maskOffset);
    prefix_t.addAddr(builder, addrOffset);
    return prefix_t.endprefix_t(builder);
  }

  public static void startprefix_t(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addAddr(FlatBufferBuilder builder, int addrOffset) { builder.addOffset(0, addrOffset, 0); }
  public static void addMask(FlatBufferBuilder builder, int maskOffset) { builder.addOffset(1, maskOffset, 0); }
  public static int endprefix_t(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public prefix_t get(int j) { return get(new prefix_t(), j); }
    public prefix_t get(prefix_t obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}
