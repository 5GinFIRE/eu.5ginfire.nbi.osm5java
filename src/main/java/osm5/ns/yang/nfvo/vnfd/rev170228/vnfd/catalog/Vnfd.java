package osm5.ns.yang.nfvo.vnfd.rev170228.vnfd.catalog;
import java.lang.Override;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.riftware._1._0.vnfd.base.rev170228.VnfdDescriptor;
import osm5.ns.yang.nfvo.vnfd.rev170228.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.vnfd.rev170228.VnfdCatalog;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * list vnfd {
 *   key id;
 *   uses vnfd-base:vnfd-descriptor;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd/vnfd-catalog/vnfd</i>
 * 
 * <p>To create instances of this class use {@link VnfdBuilder}.
 * @see VnfdBuilder
 * @see VnfdKey
 *
 */
public interface Vnfd
    extends
    ChildOf<VnfdCatalog>,
    Augmentable<Vnfd>,
    VnfdDescriptor,
    Identifiable<VnfdKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd");

    @Override
    VnfdKey key();

}

