<?xml version="1.0" encoding="UTF-8" ?>

<Form version="1.3" maxVersion="1.9" type="org.netbeans.modules.form.forminfo.JDialogFormInfo">
  <Properties>
    <Property name="defaultCloseOperation" type="int" value="0"/>
    <Property name="title" type="java.lang.String" value="Error"/>
    <Property name="resizable" type="boolean" value="false"/>
  </Properties>
  <SyntheticProperties>
    <SyntheticProperty name="formSizePolicy" type="int" value="1"/>
    <SyntheticProperty name="generateCenter" type="boolean" value="false"/>
  </SyntheticProperties>
  <AuxValues>
    <AuxValue name="FormSettings_autoResourcing" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_autoSetComponentName" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_generateFQN" type="java.lang.Boolean" value="true"/>
    <AuxValue name="FormSettings_generateMnemonicsCode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_i18nAutoMode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_layoutCodeTarget" type="java.lang.Integer" value="1"/>
    <AuxValue name="FormSettings_listenerGenerationStyle" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_variablesLocal" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_variablesModifier" type="java.lang.Integer" value="2"/>
  </AuxValues>

  <Layout>
    <DimensionLayout dim="0">
      <Group type="103" groupAlignment="0" attributes="0">
          <Component id="panelPrincipal" alignment="0" max="32767" attributes="0"/>
      </Group>
    </DimensionLayout>
    <DimensionLayout dim="1">
      <Group type="103" groupAlignment="0" attributes="0">
          <Component id="panelPrincipal" alignment="0" max="32767" attributes="0"/>
      </Group>
    </DimensionLayout>
  </Layout>
  <SubComponents>
    <Container class="javax.swing.JPanel" name="panelPrincipal">

      <Layout>
        <DimensionLayout dim="0">
          <Group type="103" groupAlignment="0" attributes="0">
              <Group type="102" attributes="0">
                  <EmptySpace pref="32" max="32767" attributes="0"/>
                  <Group type="103" groupAlignment="0" attributes="0">
                      <Group type="102" alignment="1" attributes="0">
                          <Component id="btnVolver" min="-2" max="-2" attributes="0"/>
                          <EmptySpace min="-2" pref="110" max="-2" attributes="0"/>
                      </Group>
                      <Group type="102" alignment="1" attributes="0">
                          <Component id="scrollPaneTexto" min="-2" pref="253" max="-2" attributes="0"/>
                          <EmptySpace min="-2" pref="15" max="-2" attributes="0"/>
                      </Group>
                  </Group>
              </Group>
          </Group>
        </DimensionLayout>
        <DimensionLayout dim="1">
          <Group type="103" groupAlignment="0" attributes="0">
              <Group type="102" alignment="0" attributes="0">
                  <EmptySpace max="-2" attributes="0"/>
                  <Component id="scrollPaneTexto" min="-2" pref="55" max="-2" attributes="0"/>
                  <EmptySpace type="unrelated" max="-2" attributes="0"/>
                  <Component id="btnVolver" min="-2" max="-2" attributes="0"/>
                  <EmptySpace pref="16" max="32767" attributes="0"/>
              </Group>
          </Group>
        </DimensionLayout>
      </Layout>
      <SubComponents>
        <Container class="javax.swing.JScrollPane" name="scrollPaneTexto">
          <AuxValues>
            <AuxValue name="autoScrollPane" type="java.lang.Boolean" value="true"/>
          </AuxValues>

          <Layout class="org.netbeans.modules.form.compat2.layouts.support.JScrollPaneSupportLayout"/>
          <SubComponents>
            <Component class="javax.swing.JTextArea" name="textoError">
              <Properties>
                <Property name="editable" type="boolean" value="false"/>
                <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                  <Color blue="ee" green="ee" red="ee" type="rgb"/>
                </Property>
                <Property name="columns" type="int" value="20"/>
                <Property name="rows" type="int" value="3"/>
                <Property name="text" type="java.lang.String" value="Los nombres de la pareja deben contener &#xa;como m&#xed;nimo 4 letras, si no, no habr&#xe1; amor."/>
                <Property name="border" type="javax.swing.border.Border" editor="org.netbeans.modules.form.editors2.BorderEditor">
                  <Border info="null"/>
                <