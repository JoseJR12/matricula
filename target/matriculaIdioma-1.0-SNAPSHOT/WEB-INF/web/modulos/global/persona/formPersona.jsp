
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>
<script src='/webjars/AdminLTE/2.4.2/bower_components/jquery/dist/jquery.min.js'></script>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
<!-- Main content -->
<section class="content">    
    <div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">Formulario de Registro</h3>
            </div>
    <c:url var="urlsave" value="${pageContext.request.contextPath}/${urlAccion}" />
    <frm:form modelAttribute="modeloPersona" method="post" action="${urlsave}" class="form-horizontal" >
  
            <div class="box-body">
                <div class="form-group">
                    <frm:hidden path="idPersona" />
                    <frm:label path="nombre" class="col-sm-2 control-label" >Primer Nombre:</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="nombre" class="form-control" />
                    </div>
                </div>
                <div class="form-group">                    
                    <frm:label path="appaterno" class="col-sm-2 control-label" >Apellido paterno</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="appaterno" class="form-control" />
                    </div>
                </div>
                <div class="form-group">
                    <frm:label path="apmaterno" class="col-sm-2 control-label">Apellido materno</frm:label>
                    <div class="col-sm-10"><frm:input path="apmaterno" class="form-control"  /></div>                    
                </div>
                <div class="form-group">
                    <frm:label path="apellMaterno" class="col-sm-2 control-label">Apell. Materno:</frm:label>
                    <div class="col-sm-10"><frm:input path="apellMaterno" class="form-control"  /></div>                    
                </div>
                <div class="form-group">
                    <frm:label path="Documento_identidad" class="col-sm-2 control-label">DNI:</frm:label>
                    <div class="col-sm-10"><frm:input path="Documento_identidad" class="form-control" /></div>
                </div>
                <div class="form-group ">
                    <frm:label path="ubigeo" class="col-sm-2 control-label">ubigeo:</frm:label>
                    <div class="col-sm-10" >
                    <frm:input path="ubigeo"  class="form-control" id="datepicker" placeholder="yyyy/mm/dd" />
                    </div>
                </div>
                   
                <div class="form-group" >
                    <frm:label path="sexo" class="col-sm-2 control-label">Sexo:</frm:label>
                    <div class="col-sm-10">
                    <frm:select path="sexo" class="form-control select2" style="width: 100%;">
                        <frm:options items="${ListGenero}" />
                    </frm:select></div>
                </div>
                <div class="form-group" >
                    <frm:label path="lugar_nacimiento" class="col-sm-2 control-label">lugar nacimiento</frm:label>
                    <div class="col-sm-10"><frm:input path="lugar_nacimiento" class="form-control" /></div>
                </div>
                <div class="form-group" >
                    <frm:label path="fecha_nacimiento" class="col-sm-2 control-label">fecha_nacimiento</frm:label>
                    <div class="col-sm-10"><frm:input path="fecha_nacimiento" class="form-control" placeholder="yyyy/mm/dd"/></div>
                </div>
                
                <div class="form-group" >
                  <frm:label path="direccion" class="col-sm-2 control-label">direccion</frm:label>
                  <div class="col-sm-10"><frm:input path="direccion" class="form-control" id="email" placeholder="Enter email" /></div>
                </div>
                
                <div class="form-group" >
                  <frm:label path="Email" class="col-sm-2 control-label">Email</frm:label>
                  <div class="col-sm-10"><frm:input path="Email" class="form-control" id="email" placeholder="Enter email" /></div>
                </div>
                
                 <div class="form-group" >
                  <frm:label path="Celular" class="col-sm-2 control-label">Email</frm:label>
                  <div class="col-sm-10"><frm:input path="Celular" class="form-control" id="email" placeholder="Enter email" /></div>
                </div>
                <div class="form-group" >
                    <frm:label path="usuario" class="col-sm-2 control-label">Usuario:</frm:label>
                    <div class="col-sm-10"><frm:input path="usuario" class="form-control" /></div>
                </div>
                <div class="form-group" >
                    <frm:label path="password" class="col-sm-2 control-label">Password:</frm:label>
                    <div class="col-sm-10"><frm:password path="password" class="form-control" /></div>
                </div>
                <div class="form-group" >
                    <frm:label path="Estado_civil" class="col-sm-2 control-label">Estado_civil</frm:label>
                    <div class="col-sm-10"><frm:input path="Estado_civil" class="form-control" /></div>
                </div>
              </div>
              <!-- /.box-body -->

                        
              <div class="box-footer" style="margin-left: 80px">                
                  <input type="submit" value="Guardar" class="btn btn-primary" />
                  
                  &nbsp;&nbsp;
                  <a href="${pageContext.request.contextPath}/personaMain" class="btn btn-primary">Cancelar</a> 
              </div>            
    </frm:form>
</div>

</section> 
<script type="text/javascript">
    $(function () {
       //$('#datetimepicker1').datetimepicker();
    $('#datepicker').datepicker({        
        //format: 'dd-MMM-yyyy'
        format: 'yyyy/mm/dd'
    }); 

        var dato=$('#datepicker').val();
        var dato2=dato.replace('-','/')
        
        $('#datepicker').val(dato2.replace('-','/'));
        //alert(dato2.replace('-','/'));
    });
</script>     
</div> 
  