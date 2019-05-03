package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev170228.vnfd.catalog;
import java.lang.Override;
import org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.VnfdDescriptor;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev170228.VnfdCatalog;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

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

