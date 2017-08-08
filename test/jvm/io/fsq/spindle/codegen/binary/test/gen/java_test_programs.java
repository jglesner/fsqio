
/**
 * GENERATED CODE - DO NOT EDIT!
 * Generated by foursquare.thrift.codegen v3.0.1
 *

 */


package io.fsq.spindle.codegen.binary.test.gen;

public class java_test_programs {

public static abstract class JavaProgramMeta<
  ProgramT extends io.fsq.spindle.runtime.Record<ProgramT>,
  ProgramRaw extends io.fsq.spindle.runtime.MutableRecord<ProgramT>,
  ProgramMeta extends JavaProgramMeta<ProgramT, ProgramRaw, ProgramMeta>
> implements io.fsq.spindle.runtime.MetaRecord<ProgramT, ProgramMeta> {

}

public static interface JavaProgram<io_fsq_common_thrift_descriptors_constants_gen_Const extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_enums_gen_Enum extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_headers_gen_Include extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_headers_gen_Namespace extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_services_gen_Service extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_structs_gen_Exception extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_structs_gen_Struct extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_structs_gen_Union extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_types_gen_TypeRegistry extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_types_gen_Typedef extends io.fsq.spindle.runtime.Record<?>,
  ProgramT extends io.fsq.spindle.runtime.Record<ProgramT>,
  ProgramRaw extends io.fsq.spindle.runtime.MutableRecord<ProgramT>,
  ProgramMeta extends JavaProgramMeta<ProgramT, ProgramRaw, ProgramMeta>
> extends io.fsq.spindle.runtime.Record<ProgramT> {
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_headers_gen_Namespace> namespaces();
  public scala.Option<scala.collection.Seq<io_fsq_common_thrift_descriptors_headers_gen_Namespace>> namespacesOption();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_headers_gen_Namespace> namespacesOrDefault();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_headers_gen_Namespace> namespacesOrNull();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_headers_gen_Namespace> namespacesOrThrow();
  public boolean namespacesIsSet();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_headers_gen_Include> includes();
  public scala.Option<scala.collection.Seq<io_fsq_common_thrift_descriptors_headers_gen_Include>> includesOption();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_headers_gen_Include> includesOrDefault();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_headers_gen_Include> includesOrNull();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_headers_gen_Include> includesOrThrow();
  public boolean includesIsSet();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_constants_gen_Const> constants();
  public scala.Option<scala.collection.Seq<io_fsq_common_thrift_descriptors_constants_gen_Const>> constantsOption();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_constants_gen_Const> constantsOrDefault();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_constants_gen_Const> constantsOrNull();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_constants_gen_Const> constantsOrThrow();
  public boolean constantsIsSet();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_enums_gen_Enum> enums();
  public scala.Option<scala.collection.Seq<io_fsq_common_thrift_descriptors_enums_gen_Enum>> enumsOption();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_enums_gen_Enum> enumsOrDefault();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_enums_gen_Enum> enumsOrNull();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_enums_gen_Enum> enumsOrThrow();
  public boolean enumsIsSet();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_types_gen_Typedef> typedefs();
  public scala.Option<scala.collection.Seq<io_fsq_common_thrift_descriptors_types_gen_Typedef>> typedefsOption();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_types_gen_Typedef> typedefsOrDefault();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_types_gen_Typedef> typedefsOrNull();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_types_gen_Typedef> typedefsOrThrow();
  public boolean typedefsIsSet();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_structs_gen_Struct> structs();
  public scala.Option<scala.collection.Seq<io_fsq_common_thrift_descriptors_structs_gen_Struct>> structsOption();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_structs_gen_Struct> structsOrDefault();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_structs_gen_Struct> structsOrNull();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_structs_gen_Struct> structsOrThrow();
  public boolean structsIsSet();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_structs_gen_Union> unions();
  public scala.Option<scala.collection.Seq<io_fsq_common_thrift_descriptors_structs_gen_Union>> unionsOption();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_structs_gen_Union> unionsOrDefault();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_structs_gen_Union> unionsOrNull();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_structs_gen_Union> unionsOrThrow();
  public boolean unionsIsSet();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_structs_gen_Exception> exceptions();
  public scala.Option<scala.collection.Seq<io_fsq_common_thrift_descriptors_structs_gen_Exception>> exceptionsOption();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_structs_gen_Exception> exceptionsOrDefault();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_structs_gen_Exception> exceptionsOrNull();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_structs_gen_Exception> exceptionsOrThrow();
  public boolean exceptionsIsSet();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_services_gen_Service> services();
  public scala.Option<scala.collection.Seq<io_fsq_common_thrift_descriptors_services_gen_Service>> servicesOption();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_services_gen_Service> servicesOrDefault();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_services_gen_Service> servicesOrNull();
  public scala.collection.Seq<io_fsq_common_thrift_descriptors_services_gen_Service> servicesOrThrow();
  public boolean servicesIsSet();

  public io_fsq_common_thrift_descriptors_types_gen_TypeRegistry typeRegistry();
  public scala.Option<io_fsq_common_thrift_descriptors_types_gen_TypeRegistry> typeRegistryOption();
  public io_fsq_common_thrift_descriptors_types_gen_TypeRegistry typeRegistryOrNull();
  public io_fsq_common_thrift_descriptors_types_gen_TypeRegistry typeRegistryOrThrow();
  public boolean typeRegistryIsSet();
}

public static interface JavaProgramMutable<io_fsq_common_thrift_descriptors_constants_gen_Const extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_enums_gen_Enum extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_headers_gen_Include extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_headers_gen_Namespace extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_services_gen_Service extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_structs_gen_Exception extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_structs_gen_Struct extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_structs_gen_Union extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_types_gen_TypeRegistry extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_types_gen_Typedef extends io.fsq.spindle.runtime.Record<?>,
  ProgramT extends io.fsq.spindle.runtime.Record<ProgramT>,
  ProgramRaw extends io.fsq.spindle.runtime.MutableRecord<ProgramT>,
  ProgramMeta extends JavaProgramMeta<ProgramT, ProgramRaw, ProgramMeta>
> extends JavaProgram<io_fsq_common_thrift_descriptors_constants_gen_Const, io_fsq_common_thrift_descriptors_enums_gen_Enum, io_fsq_common_thrift_descriptors_headers_gen_Include, io_fsq_common_thrift_descriptors_headers_gen_Namespace, io_fsq_common_thrift_descriptors_services_gen_Service, io_fsq_common_thrift_descriptors_structs_gen_Exception, io_fsq_common_thrift_descriptors_structs_gen_Struct, io_fsq_common_thrift_descriptors_structs_gen_Union, io_fsq_common_thrift_descriptors_types_gen_TypeRegistry, io_fsq_common_thrift_descriptors_types_gen_Typedef,
    ProgramT, ProgramRaw, ProgramMeta
  >,
  io.fsq.spindle.runtime.MutableRecord<ProgramT> {

}

public static abstract class JavaProgramRaw<io_fsq_common_thrift_descriptors_constants_gen_Const extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_enums_gen_Enum extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_headers_gen_Include extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_headers_gen_Namespace extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_services_gen_Service extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_structs_gen_Exception extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_structs_gen_Struct extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_structs_gen_Union extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_types_gen_TypeRegistry extends io.fsq.spindle.runtime.Record<?>, io_fsq_common_thrift_descriptors_types_gen_Typedef extends io.fsq.spindle.runtime.Record<?>,
  ProgramT extends io.fsq.spindle.runtime.Record<ProgramT>,
  ProgramRaw extends io.fsq.spindle.runtime.MutableRecord<ProgramT>,
  ProgramMeta extends JavaProgramMeta<ProgramT, ProgramRaw, ProgramMeta>
> implements JavaProgramMutable<io_fsq_common_thrift_descriptors_constants_gen_Const, io_fsq_common_thrift_descriptors_enums_gen_Enum, io_fsq_common_thrift_descriptors_headers_gen_Include, io_fsq_common_thrift_descriptors_headers_gen_Namespace, io_fsq_common_thrift_descriptors_services_gen_Service, io_fsq_common_thrift_descriptors_structs_gen_Exception, io_fsq_common_thrift_descriptors_structs_gen_Struct, io_fsq_common_thrift_descriptors_structs_gen_Union, io_fsq_common_thrift_descriptors_types_gen_TypeRegistry, io_fsq_common_thrift_descriptors_types_gen_Typedef,
    ProgramT, ProgramRaw, ProgramMeta
  >,
  io.fsq.spindle.runtime.Record<ProgramT> {

}



}
