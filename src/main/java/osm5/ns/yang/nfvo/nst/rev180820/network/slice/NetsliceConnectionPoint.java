package osm5.ns.yang.nfvo.nst.rev180820.network.slice;
import java.lang.Override;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.nst.rev180820.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nst.rev180820.NetworkSlice;
import osm5.ns.yang.nfvo.nst.rev180820.SliceConnectionPoints;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * list netslice-connection-point {
 *   key name;
 *   uses slice-connection-points;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/network-slice/netslice-connection-point</i>
 * 
 * <p>To create instances of this class use {@link NetsliceConnectionPointBuilder}.
 * @see NetsliceConnectionPointBuilder
 * @see NetsliceConnectionPointKey
 *
 */
public interface NetsliceConnectionPoint
    extends
    ChildOf<NetworkSlice>,
    Augmentable<NetsliceConnectionPoint>,
    SliceConnectionPoints,
    Identifiable<NetsliceConnectionPointKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("netslice-connection-point");

    @Override
    NetsliceConnectionPointKey key();

}

