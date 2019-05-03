package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr;
import java.lang.Override;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.EventServicePrimitive;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Set of service primitives toexecute during termination of NSD.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list terminate-service-primitive {
 *   key seq;
 *   uses event-service-primitive;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata/nsr/terminate-service-primitive</i>
 * 
 * <p>To create instances of this class use {@link TerminateServicePrimitiveBuilder}.
 * @see TerminateServicePrimitiveBuilder
 * @see TerminateServicePrimitiveKey
 *
 */
public interface TerminateServicePrimitive
    extends
    ChildOf<Nsr>,
    Augmentable<TerminateServicePrimitive>,
    EventServicePrimitive,
    Identifiable<TerminateServicePrimitiveKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("terminate-service-primitive");

    @Override
    TerminateServicePrimitiveKey key();

}

