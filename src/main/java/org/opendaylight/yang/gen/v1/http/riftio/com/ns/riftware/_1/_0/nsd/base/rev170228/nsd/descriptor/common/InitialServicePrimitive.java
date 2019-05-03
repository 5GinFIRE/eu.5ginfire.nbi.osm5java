package org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common;
import java.lang.Override;
import org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.NsdDescriptorCommon;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.EventConfig;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Initial set of service primitives for NSD.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list initial-service-primitive {
 *   key seq;
 *   uses manotypes:event-config;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/initial-service-primitive</i>
 * 
 * <p>To create instances of this class use {@link InitialServicePrimitiveBuilder}.
 * @see InitialServicePrimitiveBuilder
 * @see InitialServicePrimitiveKey
 *
 */
public interface InitialServicePrimitive
    extends
    ChildOf<NsdDescriptorCommon>,
    Augmentable<InitialServicePrimitive>,
    EventConfig,
    Identifiable<InitialServicePrimitiveKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("initial-service-primitive");

    @Override
    InitialServicePrimitiveKey key();

}

