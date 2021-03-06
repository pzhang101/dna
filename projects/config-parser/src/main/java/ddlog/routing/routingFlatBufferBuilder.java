// Automatically generated by the DDlog compiler.
package ddlog.routing;
import ddlogapi.DDlogAPI;
import ddlogapi.DDlogException;
import com.google.flatbuffers.*;
public class routingFlatBufferBuilder
{
    protected FlatBufferBuilder fbbuilder;
    public routingFlatBufferBuilder() {
        fbbuilder = new FlatBufferBuilder();
    }
    public routingFlatBufferBuilder(FlatBufferBuilder fbbuilder) {
        this.fbbuilder = fbbuilder;
    }
    public ip_tWriter create_ip_t(int b3, int b2, int b1, int b0)
    {
        return new ip_tWriter(ddlog.__routing.ip_t.createip_t(fbbuilder, b3, b2, b1, b0));
    }
    public prefix_tWriter create_prefix_t(ip_tWriter addr, ip_tWriter mask)
    {
        return new prefix_tWriter(ddlog.__routing.prefix_t.createprefix_t(fbbuilder, addr.offset, mask.offset));
    }
    public vnode_tWriter create_vnode_t(String device, String vrf)
    {
        return new vnode_tWriter(ddlog.__routing.vnode_t.createvnode_t(fbbuilder, fbbuilder.createString(device), fbbuilder.createString(vrf)));
    }
    public BgpAggregationWriter create_BgpAggregation(vnode_tWriter node, prefix_tWriter prefix)
    {
        return new BgpAggregationWriter(ddlog.__routing.BgpAggregation.createBgpAggregation(fbbuilder, node.offset, prefix.offset));
    }
    public BgpMultipathWriter create_BgpMultipath(vnode_tWriter node, long k, boolean relax)
    {
        return new BgpMultipathWriter(ddlog.__routing.BgpMultipath.createBgpMultipath(fbbuilder, node.offset, k, relax));
    }
    public BgpNeighborWriter create_BgpNeighbor(vnode_tWriter node1, ip_tWriter ip1, vnode_tWriter node2, ip_tWriter ip2)
    {
        return new BgpNeighborWriter(ddlog.__routing.BgpNeighbor.createBgpNeighbor(fbbuilder, node1.offset, ip1.offset, node2.offset, ip2.offset));
    }
    public BgpNetworkWriter create_BgpNetwork(vnode_tWriter node, prefix_tWriter prefix)
    {
        return new BgpNetworkWriter(ddlog.__routing.BgpNetwork.createBgpNetwork(fbbuilder, node.offset, prefix.offset));
    }
    public BgpRedisWriter create_BgpRedis(vnode_tWriter node, String protocol)
    {
        return new BgpRedisWriter(ddlog.__routing.BgpRedis.createBgpRedis(fbbuilder, node.offset, fbbuilder.createString(protocol)));
    }
    public BgpReflectClientWriter create_BgpReflectClient(vnode_tWriter node1, ip_tWriter ip1, vnode_tWriter node2, ip_tWriter ip2)
    {
        return new BgpReflectClientWriter(ddlog.__routing.BgpReflectClient.createBgpReflectClient(fbbuilder, node1.offset, ip1.offset, node2.offset, ip2.offset));
    }
    public FibWriter create_Fib(String node, String prefix, String intf, String next_hop_ip)
    {
        return new FibWriter(ddlog.__routing.Fib.createFib(fbbuilder, fbbuilder.createString(node), fbbuilder.createString(prefix), fbbuilder.createString(intf), fbbuilder.createString(next_hop_ip)));
    }
    public IBgpNeighborWriter create_IBgpNeighbor(vnode_tWriter node1, ip_tWriter ip1, vnode_tWriter node2, ip_tWriter ip2)
    {
        return new IBgpNeighborWriter(ddlog.__routing.IBgpNeighbor.createIBgpNeighbor(fbbuilder, node1.offset, ip1.offset, node2.offset, ip2.offset));
    }
    public InterfaceWriter create_Interface(vnode_tWriter node, String intf, prefix_tWriter prefix)
    {
        return new InterfaceWriter(ddlog.__routing.Interface.createInterface(fbbuilder, node.offset, fbbuilder.createString(intf), prefix.offset));
    }
    public L3LinkWriter create_L3Link(String node1, String int1, String node2, String int2)
    {
        return new L3LinkWriter(ddlog.__routing.L3Link.createL3Link(fbbuilder, fbbuilder.createString(node1), fbbuilder.createString(int1), fbbuilder.createString(node2), fbbuilder.createString(int2)));
    }
    public NodeWriter create_Node(vnode_tWriter node, long as_, long id)
    {
        return new NodeWriter(ddlog.__routing.Node.createNode(fbbuilder, node.offset, as_, id));
    }
    public OspfIntfSettingWriter create_OspfIntfSetting(vnode_tWriter node, String intf, long cost, long area, boolean passive, long process)
    {
        return new OspfIntfSettingWriter(ddlog.__routing.OspfIntfSetting.createOspfIntfSetting(fbbuilder, node.offset, fbbuilder.createString(intf), cost, area, passive, process));
    }
    public OspfMultipathWriter create_OspfMultipath(vnode_tWriter node, long k, long process)
    {
        return new OspfMultipathWriter(ddlog.__routing.OspfMultipath.createOspfMultipath(fbbuilder, node.offset, k, process));
    }
    public OspfRedisWriter create_OspfRedis(vnode_tWriter node, String protocol, long process)
    {
        return new OspfRedisWriter(ddlog.__routing.OspfRedis.createOspfRedis(fbbuilder, node.offset, fbbuilder.createString(protocol), process));
    }
    public OspfStubAreaWriter create_OspfStubArea(vnode_tWriter node, long process, long area, boolean no_summary, boolean default_originate, boolean no_redis, long metric)
    {
        return new OspfStubAreaWriter(ddlog.__routing.OspfStubArea.createOspfStubArea(fbbuilder, node.offset, process, area, no_summary, default_originate, no_redis, metric));
    }
    public community_tWriter create_community_t(String as_, String tag)
    {
        return new community_tWriter(ddlog.__routing.community_t.createcommunity_t(fbbuilder, fbbuilder.createString(as_), fbbuilder.createString(tag)));
    }
    public set_attr_tWriter create_SetNextHopIp(ip_tWriter next_hop_ip)
    {
        return new set_attr_tWriter(ddlog.__routing.set_attr_t.SetNextHopIp, ddlog.__routing.SetNextHopIp.createSetNextHopIp(fbbuilder, next_hop_ip.offset));
    }
    public set_attr_tWriter create_SetLocalPref(long local_pref)
    {
        return new set_attr_tWriter(ddlog.__routing.set_attr_t.SetLocalPref, ddlog.__routing.SetLocalPref.createSetLocalPref(fbbuilder, local_pref));
    }
    public set_attr_tWriter create_SetMed(long med)
    {
        return new set_attr_tWriter(ddlog.__routing.set_attr_t.SetMed, ddlog.__routing.SetMed.createSetMed(fbbuilder, med));
    }
    public set_attr_tWriter create_SetCommunity(boolean additive, community_tWriter community)
    {
        return new set_attr_tWriter(ddlog.__routing.set_attr_t.SetCommunity, ddlog.__routing.SetCommunity.createSetCommunity(fbbuilder, additive, community.offset));
    }
    protected static int[] create_ddlog_std_Vec_set_attr_t_(FlatBufferBuilder fbbuilder, java.util.List<set_attr_tWriter> v)
    {
        int[] res = new int[v.size()];
        for (int __i = 0; __i < v.size(); __i++)
        {
            res[__i] = ddlog.__routing.__Table_set_attr_t.create__Table_set_attr_t(fbbuilder, v.get(__i).type, v.get(__i).offset);
        }
        return res;
    }
    public prefix_list_tWriter create_CommonPrefix(prefix_tWriter prefix)
    {
        return new prefix_list_tWriter(ddlog.__routing.prefix_list_t.CommonPrefix, ddlog.__routing.CommonPrefix.createCommonPrefix(fbbuilder, prefix.offset));
    }
    public prefix_list_tWriter create_ExtendPrefix(prefix_tWriter prefix, long ge, long le)
    {
        return new prefix_list_tWriter(ddlog.__routing.prefix_list_t.ExtendPrefix, ddlog.__routing.ExtendPrefix.createExtendPrefix(fbbuilder, prefix.offset, ge, le));
    }
    protected static int[] create_ddlog_std_Vec_prefix_list_t_(FlatBufferBuilder fbbuilder, java.util.List<prefix_list_tWriter> v)
    {
        int[] res = new int[v.size()];
        for (int __i = 0; __i < v.size(); __i++)
        {
            res[__i] = ddlog.__routing.__Table_prefix_list_t.create__Table_prefix_list_t(fbbuilder, v.get(__i).type, v.get(__i).offset);
        }
        return res;
    }
    public match_attr_tWriter create_MatchNextHopIp(ip_tWriter next_hop_ip)
    {
        return new match_attr_tWriter(ddlog.__routing.match_attr_t.MatchNextHopIp, ddlog.__routing.MatchNextHopIp.createMatchNextHopIp(fbbuilder, next_hop_ip.offset));
    }
    public match_attr_tWriter create_MatchPrefixList(java.util.List<prefix_list_tWriter> prefix_list)
    {
        return new match_attr_tWriter(ddlog.__routing.match_attr_t.MatchPrefixList, ddlog.__routing.MatchPrefixList.createMatchPrefixList(fbbuilder, ddlog.__routing.MatchPrefixList.createPrefixListVector(fbbuilder,routingFlatBufferBuilder.create_ddlog_std_Vec_prefix_list_t_(fbbuilder, prefix_list))));
    }
    public match_attr_tWriter create_MatchAsPath(long as_)
    {
        return new match_attr_tWriter(ddlog.__routing.match_attr_t.MatchAsPath, ddlog.__routing.MatchAsPath.createMatchAsPath(fbbuilder, as_));
    }
    public match_attr_tWriter create_MatchCommunity(community_tWriter community)
    {
        return new match_attr_tWriter(ddlog.__routing.match_attr_t.MatchCommunity, ddlog.__routing.MatchCommunity.createMatchCommunity(fbbuilder, community.offset));
    }
    protected static int[] create_ddlog_std_Vec_match_attr_t_(FlatBufferBuilder fbbuilder, java.util.List<match_attr_tWriter> v)
    {
        int[] res = new int[v.size()];
        for (int __i = 0; __i < v.size(); __i++)
        {
            res[__i] = ddlog.__routing.__Table_match_attr_t.create__Table_match_attr_t(fbbuilder, v.get(__i).type, v.get(__i).offset);
        }
        return res;
    }
    public route_map_tWriter create_route_map_t(boolean permit, java.util.List<match_attr_tWriter> match_condition, java.util.List<set_attr_tWriter> set_action)
    {
        return new route_map_tWriter(ddlog.__routing.route_map_t.createroute_map_t(fbbuilder, permit, ddlog.__routing.route_map_t.createMatchConditionVector(fbbuilder,routingFlatBufferBuilder.create_ddlog_std_Vec_match_attr_t_(fbbuilder, match_condition)), ddlog.__routing.route_map_t.createSetActionVector(fbbuilder,routingFlatBufferBuilder.create_ddlog_std_Vec_set_attr_t_(fbbuilder, set_action))));
    }
    protected static int[] create_ddlog_std_Vec_route_map_t_(FlatBufferBuilder fbbuilder, java.util.List<route_map_tWriter> v)
    {
        int[] res = new int[v.size()];
        for (int __i = 0; __i < v.size(); __i++)
        {
            res[__i] = v.get(__i).offset;
        }
        return res;
    }
    public RouteMapInWriter create_RouteMapIn(vnode_tWriter node, vnode_tWriter from_node, java.util.List<route_map_tWriter> policy)
    {
        return new RouteMapInWriter(ddlog.__routing.RouteMapIn.createRouteMapIn(fbbuilder, node.offset, from_node.offset, ddlog.__routing.RouteMapIn.createPolicyVector(fbbuilder,routingFlatBufferBuilder.create_ddlog_std_Vec_route_map_t_(fbbuilder, policy))));
    }
    public RouteMapOutWriter create_RouteMapOut(vnode_tWriter node, vnode_tWriter to_node, java.util.List<route_map_tWriter> policy)
    {
        return new RouteMapOutWriter(ddlog.__routing.RouteMapOut.createRouteMapOut(fbbuilder, node.offset, to_node.offset, ddlog.__routing.RouteMapOut.createPolicyVector(fbbuilder,routingFlatBufferBuilder.create_ddlog_std_Vec_route_map_t_(fbbuilder, policy))));
    }
    public StaticRouteWriter create_StaticRoute(vnode_tWriter node, prefix_tWriter prefix, ip_tWriter next_hop_ip, long adminCost)
    {
        return new StaticRouteWriter(ddlog.__routing.StaticRoute.createStaticRoute(fbbuilder, node.offset, prefix.offset, next_hop_ip.offset, adminCost));
    }
    public Tuple0Writer create_Tuple0()
    {
        return new Tuple0Writer(((java.util.function.Supplier<Integer>) (() -> 
                                {
                                    ddlog.__routing.Tuple0.startTuple0(fbbuilder);
                                    return Integer.valueOf( ddlog.__routing.Tuple0.endTuple0(fbbuilder));
                                })).get());
    }
}