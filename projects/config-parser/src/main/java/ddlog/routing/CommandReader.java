// Automatically generated by the DDlog compiler.
package ddlog.routing;
import com.google.flatbuffers.*;
import ddlogapi.DDlogCommand;
public final class CommandReader implements DDlogCommand<Object>
{
    protected CommandReader (ddlog.__routing.__Command inner) { this.inner = inner; }
    private ddlog.__routing.__Command inner;
    public final Kind kind(){
        if (this.inner.weight() > 0) {
            return DDlogCommand.Kind.Insert;
        } else {
            return DDlogCommand.Kind.DeleteVal;
        }
    }
    public final long weight() { return java.lang.Math.abs((long)this.inner.weight()); }
    public final int relid() { return (int)this.inner.relid(); }
    public final Object toModify() { return null; }
    public final Object value() {
        switch (this.relid()) {
            case 7: {
                ddlog.__routing.BgpAggregation val = (ddlog.__routing.BgpAggregation)this.inner.val(new ddlog.__routing.BgpAggregation());
                return (Object) new BgpAggregationReader(val);
            }
            case 8: {
                ddlog.__routing.BgpMultipath val = (ddlog.__routing.BgpMultipath)this.inner.val(new ddlog.__routing.BgpMultipath());
                return (Object) new BgpMultipathReader(val);
            }
            case 10: {
                ddlog.__routing.BgpNeighbor val = (ddlog.__routing.BgpNeighbor)this.inner.val(new ddlog.__routing.BgpNeighbor());
                return (Object) new BgpNeighborReader(val);
            }
            case 11: {
                ddlog.__routing.BgpNetwork val = (ddlog.__routing.BgpNetwork)this.inner.val(new ddlog.__routing.BgpNetwork());
                return (Object) new BgpNetworkReader(val);
            }
            case 12: {
                ddlog.__routing.BgpRedis val = (ddlog.__routing.BgpRedis)this.inner.val(new ddlog.__routing.BgpRedis());
                return (Object) new BgpRedisReader(val);
            }
            case 13: {
                ddlog.__routing.BgpReflectClient val = (ddlog.__routing.BgpReflectClient)this.inner.val(new ddlog.__routing.BgpReflectClient());
                return (Object) new BgpReflectClientReader(val);
            }
            case 16: {
                ddlog.__routing.Fib val = (ddlog.__routing.Fib)this.inner.val(new ddlog.__routing.Fib());
                return (Object) new FibReader(val);
            }
            case 18: {
                ddlog.__routing.IBgpNeighbor val = (ddlog.__routing.IBgpNeighbor)this.inner.val(new ddlog.__routing.IBgpNeighbor());
                return (Object) new IBgpNeighborReader(val);
            }
            case 19: {
                ddlog.__routing.Interface val = (ddlog.__routing.Interface)this.inner.val(new ddlog.__routing.Interface());
                return (Object) new InterfaceReader(val);
            }
            case 21: {
                ddlog.__routing.L3Link val = (ddlog.__routing.L3Link)this.inner.val(new ddlog.__routing.L3Link());
                return (Object) new L3LinkReader(val);
            }
            case 28: {
                ddlog.__routing.Node val = (ddlog.__routing.Node)this.inner.val(new ddlog.__routing.Node());
                return (Object) new NodeReader(val);
            }
            case 30: {
                ddlog.__routing.OspfIntfSetting val = (ddlog.__routing.OspfIntfSetting)this.inner.val(new ddlog.__routing.OspfIntfSetting());
                return (Object) new OspfIntfSettingReader(val);
            }
            case 31: {
                ddlog.__routing.OspfMultipath val = (ddlog.__routing.OspfMultipath)this.inner.val(new ddlog.__routing.OspfMultipath());
                return (Object) new OspfMultipathReader(val);
            }
            case 34: {
                ddlog.__routing.OspfRedis val = (ddlog.__routing.OspfRedis)this.inner.val(new ddlog.__routing.OspfRedis());
                return (Object) new OspfRedisReader(val);
            }
            case 37: {
                ddlog.__routing.OspfStubArea val = (ddlog.__routing.OspfStubArea)this.inner.val(new ddlog.__routing.OspfStubArea());
                return (Object) new OspfStubAreaReader(val);
            }
            case 38: {
                ddlog.__routing.RouteMapIn val = (ddlog.__routing.RouteMapIn)this.inner.val(new ddlog.__routing.RouteMapIn());
                return (Object) new RouteMapInReader(val);
            }
            case 39: {
                ddlog.__routing.RouteMapOut val = (ddlog.__routing.RouteMapOut)this.inner.val(new ddlog.__routing.RouteMapOut());
                return (Object) new RouteMapOutReader(val);
            }
            case 41: {
                ddlog.__routing.StaticRoute val = (ddlog.__routing.StaticRoute)this.inner.val(new ddlog.__routing.StaticRoute());
                return (Object) new StaticRouteReader(val);
            }
            default: throw new IllegalArgumentException("Invalid relation id" + this.relid());
        }
    }
}