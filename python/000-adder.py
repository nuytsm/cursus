import os

def generate_index_adoc(adoc_files):
    with open('index.adoc', 'w') as index_file:
        for adoc_file in adoc_files:
            index_file.write(f"include::{adoc_file}[]\n")

def main():
    working_directory = os.getcwd()
    adoc_files = [filename for filename in os.listdir(working_directory) if filename.endswith('.adoc')]

    if adoc_files:
        generate_index_adoc(adoc_files)
        print(f'index.adoc generated with {len(adoc_files)} include directives.')
    else:
        print('No .adoc files found in the working directory.')

if __name__ == "__main__":
    main()
